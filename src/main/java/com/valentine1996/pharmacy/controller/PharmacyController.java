/// *** *** Controller :: PharmacyController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 19:15:10 :: 2014-07-13 12:42:45
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.Pharmacy;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Controller for pharmacy
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/pharmacy")
public class PharmacyController {

    public static final String REDIRECT_PHARMACY_LIST = "redirect:/pharmacy/list";

    @Autowired
    PharmacyService pharmacyService;

    /**
     * GET list of pharmacies
     *
     * @param model
     * @return String ( pharmacies )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < Pharmacy > pharmacies = pharmacyService.findAll();
        model.addAttribute("pharmaciesList", pharmacies);

        return "pharmacies";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createPharmacy";
    }
    /**
     * POST
     *
     * Create new pharmacy
     *
     * @param pharmacy
     * @return String ( years list )
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          Pharmacy pharmacy,  
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createPharmacy";
        }
        try {
            Pharmacy newPharmacy = new Pharmacy();
            newPharmacy.setName(pharmacy.getName());
            newPharmacy.setShortName(pharmacy.getShortName());
            newPharmacy.setLegalForm(pharmacy.getLegalForm());
            newPharmacy.setRegion(pharmacy.getRegion());
            newPharmacy.setCalculationConsider(pharmacy.getCalculationConsider());
            pharmacyService.create(newPharmacy);
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_PHARMACY_LIST;
    }

    /**
     * Get update form for pharmacy
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        Pharmacy pharmacy = pharmacyService.find(id);
        model.addAttribute("pharmacy", pharmacy);
        return "updatePharmacy";
    }


    /**
     * POST
     *
     * Update exist pharmacy
     *
     * @param pharmacy
     * @param id
     * @return String ( years list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID") Long id,
                         @Valid
                         @ModelAttribute 
                         Pharmacy pharmacy,
                         BindingResult result,
                         ModelMap model){
        Pharmacy updatedPharmacy = pharmacyService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("pharmacy", pharmacy);
            return "updatePharmacy";
        }
        updatedPharmacy.setName(pharmacy.getName());
        updatedPharmacy.setShortName(pharmacy.getShortName());
        updatedPharmacy.setLegalForm(pharmacy.getLegalForm());
        updatedPharmacy.setRegion(pharmacy.getRegion());
        updatedPharmacy.setCalculationConsider(pharmacy.getCalculationConsider());

        pharmacyService.update(updatedPharmacy);
        return REDIRECT_PHARMACY_LIST;
    }

    /**
     * DELETE
     *
     * Delete exist pharmacy
     *
     * @param id
     */
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        try {
            pharmacyService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_PHARMACY_LIST;
    }
}
