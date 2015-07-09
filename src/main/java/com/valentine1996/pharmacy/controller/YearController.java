/// *** *** Controller :: YearController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 19:15:10 :: 2014-07-08
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;

import com.valentine1996.pharmacy.model.entity.Expense;
import com.valentine1996.pharmacy.model.entity.Pharmacy;
import com.valentine1996.pharmacy.model.entity.Profit;
import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import java.util.List;

/**
 * Controller for year
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/year")
public class YearController {

    public static final String REDIRECT_YEAR_LIST = "redirect:/year/list";

    @Autowired
    YearService yearService;

    /**
     * GET 
     *
     * GET list of years
     *
     * @param model
     * @return String ( years )
     */
    @GET
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < Year > years= yearService.findAll();
        model.addAttribute("yearsList", years);

        return "years";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createYear";
    }
    /**
     * POST
     *
     * Create new year
     *
     * @param year
     * @return String ( years list )
     */
    @POST
    @RequestMapping( value = "/")
    public String create( @Valid 
                          @ModelAttribute 
                          Year year,  BindingResult result ){

        if (result.hasErrors()) {
            return "createYear";
        }
        yearService.create(year);
        
        return REDIRECT_YEAR_LIST;
    }

    /**
     * get update form for year 
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage( @PathVariable("ID") Long id, ModelMap model ){
        Year year = yearService.find(id);
        model.addAttribute("year", year);
        return "updateYear";
    }


    /**
     * PUT
     *
     * Update exist year
     *
     * @param year
     * @param id
     * @return String ( years list )
     */
    @PUT
    @RequestMapping( value = "/update/{ID}")
    public String update(@PathVariable("ID") Long id, @ModelAttribute Year year){

        Year updatedYear = yearService.find(id);

        updatedYear.setName(year.getName());

        yearService.update(updatedYear);
        return REDIRECT_YEAR_LIST;
    }

    /**
     * DELETE
     *
     * Delete exist year
     *
     * @param id
     */
    @DELETE
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        yearService.delete(id);
        return REDIRECT_YEAR_LIST;
    }
}
