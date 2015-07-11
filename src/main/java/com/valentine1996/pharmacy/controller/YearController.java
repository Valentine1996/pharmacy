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


import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.service.YearService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid 
                          @ModelAttribute 
                          Year year,  BindingResult result ){

        if (result.hasErrors()) {
            return "createYear";
        }
        try {
            Year newYear = new Year();
            newYear.setName(year.getName());
            yearService.create(newYear);
        }
        catch( Exception e){
            Error error;
            
        }
        return REDIRECT_YEAR_LIST;
    }

    /**
     * get update form for year 
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
                                 @PathVariable("ID") Long id,
                                 ModelMap model){
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
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID") Long id, 
                         @Valid
                         @ModelAttribute Year year,
                         BindingResult result,
                         ModelMap model){
        Year updatedYear = yearService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("year", year);
            return "updateYear";
        }
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
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        try {
            yearService.delete(id);
        } 
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_YEAR_LIST;
    }
    
//    @ExceptionHandler(Exception.class)
//    public void handleException(Exception e){
//        int x = 1;
//
//    }
}
