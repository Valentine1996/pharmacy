/// *** *** Controller :: DistributionWayController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 16:50:10 :: 2014-07-12
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import com.valentine1996.pharmacy.model.entity.DistributionWay;
import com.valentine1996.pharmacy.model.service.DistributionWayService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

/**
 * Controller for year
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/disway")
public class DistributionWayController {

    public static final String REDIRECT_DISWAY_LIST = "redirect:/disway/list";

    @Autowired
    DistributionWayService distributionWayService;

    /**
     * GET 
     *
     * GET list of distribution ways
     *
     * @param model
     * @return String ( distributionWays )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < DistributionWay > distributionWays = distributionWayService.findAll();
        model.addAttribute("diswayList", distributionWays);

        return "distributionWays";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createDistributionWay";
    }

    /**
     * POST
     *
     * Create distributionWay
     *
     * @param distributionWay
     * @return String ( distributionWay list )
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          DistributionWay distributionWay,
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createDistributionWay";
        }
        try {
            DistributionWay newDistributionWay = new DistributionWay();
            newDistributionWay.setName(distributionWay.getName());
            distributionWayService.create( newDistributionWay );
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_DISWAY_LIST;
    }

    /**
     * Get update form for distribution Way
     * @param id
     * @param model
     * @return String ( updateDistributionWay )
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        DistributionWay distributionWay = distributionWayService.find(id);
        model.addAttribute("distributionWay", distributionWay);
        return "updateDistributionWay";
    }


    /**
     * POST
     *
     * Update exist distributionWay
     *
     * @param distributionWay
     * @param id
     * @return String ( years list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID")
                         Long id,
                         @Valid
                         @ModelAttribute
                         DistributionWay distributionWay,
                         BindingResult result,
                         ModelMap model){
        DistributionWay updateDistributionWay= distributionWayService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("distributionWay", distributionWay);
            return "updateDistributionWay";
        }
        updateDistributionWay.setName(distributionWay.getName());

        distributionWayService.update(updateDistributionWay);
        return REDIRECT_DISWAY_LIST;
    }

    /**
     * DELETE
     *
     * Delete exist distribution way
     *
     * @param id
     */
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        try {
            distributionWayService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_DISWAY_LIST;
    }
}
