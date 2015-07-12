/// *** *** Controller :: AccountingSystemController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 15:21:45 :: 2014-07-12 16:45:55
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import com.valentine1996.pharmacy.model.service.implementation.AccountingSystemServiceImpl;
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
@RequestMapping( value = "/acs")
public class AccountingSystemController {

    public static final String REDIRECT_ACS_LIST = "redirect:/acs/list";

    @Autowired
    AccountingSystemServiceImpl accountingSystemService;

    /**
     * GET 
     *
     * GET list of accounting systems
     *
     * @param model
     * @return String ( years )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < AccountingSystem > accountingSystems = accountingSystemService.findAll();
        model.addAttribute("acsList", accountingSystems);

        return "accountingSystems";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createAccountingSystem";
    }
    /**
     * POST
     *
     * Create accounting system
     *
     * @param accountingSystem
     * @return String ( years list )
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          AccountingSystem accountingSystem,  
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createAccountingSystem";
        }
        try {
            AccountingSystem newAccountingSystem1= new AccountingSystem();
            newAccountingSystem1.setName(accountingSystem.getName());
            accountingSystemService.create( newAccountingSystem1 );
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_ACS_LIST;
    }

    /**
     * Get update form for accounting system
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        AccountingSystem accountingSystem = accountingSystemService.find(id);
        model.addAttribute("accountingSystem", accountingSystem);
        return "updateAccountingSystem";
    }


    /**
     * POST
     *
     * Update exist accountingSystem
     *
     * @param accountingSystem
     * @param id
     * @return String ( years list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID") 
                         Long id,
                         @Valid
                         @ModelAttribute 
                         AccountingSystem accountingSystem,
                         BindingResult result,
                         ModelMap model){
        AccountingSystem updatedAccountingSystem = accountingSystemService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("accountingSystem", accountingSystem);
            return "updateAccountingSystem";
        }
        updatedAccountingSystem.setName(accountingSystem.getName());

        accountingSystemService.update(updatedAccountingSystem);
        return REDIRECT_ACS_LIST;
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
            accountingSystemService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_ACS_LIST;
    }
}
