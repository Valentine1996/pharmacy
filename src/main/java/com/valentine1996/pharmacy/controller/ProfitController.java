/// *** *** Controller :: ProfitController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-13 11:10:00 :: 2014-07-13
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.Pharmacy;
import com.valentine1996.pharmacy.model.entity.Profit;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import com.valentine1996.pharmacy.model.service.ProfitService;
import com.valentine1996.pharmacy.model.service.YearService;
import com.valentine1996.pharmacy.view.form.ProfitForm;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

/**
 * Controller for profit
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/profit")
public class ProfitController {

    public static final String REDIRECT_PROFIT_LIST = "redirect:/profit/list";

    @Autowired
    ProfitService profitService;

    @Autowired
    YearService yearService;
    
    @Autowired
    PharmacyService pharmacyService;
    /**
     * GET list of profits
     *
     * @param model
     * @return String ( profits )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < Profit > profits = profitService.findAll();
        model.addAttribute("profits", profits);
        
        return "profits";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage( ModelMap model ){
        ProfitForm profitForm = new ProfitForm();
        model.addAttribute( "profitForm", profitForm);
        return "createProfit";
    }
    /**
     * POST
     *
     * Create new profit
     *
     * @param profitForm
     * @return String ( profits list )
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          ProfitForm profitForm,
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createProfit";
        }
        try {
            //- Create full profit -//
            Profit newProfit = new Profit();
            //- Find profit year and add to profit -//
            Year year = yearService.findByName(profitForm.getYear());
            newProfit.setYear(year);
            //- Find profit pharmacy and add to profit -//
            Pharmacy pharmacy = pharmacyService.findByShortName(profitForm.getPharmacy());
            newProfit.setPharmacy(pharmacy);
            //-Set other objects-//
            newProfit.setMonth( profitForm.getMonth());
            newProfit.setProfit( profitForm.getProfit());
            newProfit.setPH( profitForm.getPH());
            newProfit.setGI( profitForm.getGI());
            newProfit.setGIBonus( profitForm.getGIBonus());
            newProfit.setGIDeposit( profitForm.getGIDeposit());
            newProfit.setGIAnother1( profitForm.getGIAnother1());
            newProfit.setGIAnother2( profitForm.getGIAnother2());
            newProfit.setGITotal(profitForm.getGITotal());
            
            profitService.create(newProfit);
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_PROFIT_LIST;
    }

    /**
     * Get update form for profit
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        Profit profit = profitService.find(id);
        //-Create data for form in update jsp (profitForm) -//
        ProfitForm profitForm = new ProfitForm();

        profitForm.setId(profit.getId());
        profitForm.setMonth(profit.getMonth());
        profitForm.setYear(profit.getYear().getName());
        profitForm.setPharmacy(profit.getPharmacy().getShortName());
        profitForm.setProfit( profit.getProfit());
        profitForm.setPH( profit.getPH());
        profitForm.setGI( profit.getGI());
        profitForm.setGIBonus( profit.getGIBonus());
        profitForm.setGIDeposit( profit.getGIDeposit());
        profitForm.setGIAnother1( profit.getGIAnother1());
        profitForm.setGIAnother2( profit.getGIAnother2());
        profitForm.setGITotal( profit.getGITotal());
        model.addAttribute("profitForm", profitForm);
        return "updateProfit";
    }


    /**
     * POST
     *
     * Update exist profit
     *
     * @param profitForm
     * @param id
     * @return String ( profits list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID") Long id,
                         @Valid
                         @ModelAttribute 
                         ProfitForm profitForm,
                         BindingResult result,
                         ModelMap model){
        if (result.hasErrors()) {
            model.addAttribute("profitForm", profitForm);
            return "updateProfit";
        }

        Profit updatedProfit = profitService.find(id);
        //-Create data for form in update jsp (profitForm) -//

        updatedProfit.setId(profitForm.getId());
        updatedProfit.setMonth(profitForm.getMonth());
        //- Find profit year and add to profit -//
        Year year = yearService.findByName(profitForm.getYear());
        updatedProfit.setYear(year);
        //- Find profit pharmacy and add to profit -//
        Pharmacy pharmacy = pharmacyService.findByShortName(profitForm.getPharmacy());
        updatedProfit.setPharmacy(pharmacy);
        updatedProfit.setProfit( profitForm.getProfit());
        updatedProfit.setPH( profitForm.getPH());
        updatedProfit.setGI( profitForm.getGI());
        updatedProfit.setGIBonus( profitForm.getGIBonus());
        updatedProfit.setGIDeposit( profitForm.getGIDeposit());
        updatedProfit.setGIAnother1( profitForm.getGIAnother1());
        updatedProfit.setGIAnother2( profitForm.getGIAnother2());
        updatedProfit.setGITotal( profitForm.getGITotal());

        profitService.update(updatedProfit);
        return REDIRECT_PROFIT_LIST;
    }

    /**
     * DELETE
     *
     * Delete exist year
     *
     * @param id
     */
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        try {
            profitService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_PROFIT_LIST;
    }
}
