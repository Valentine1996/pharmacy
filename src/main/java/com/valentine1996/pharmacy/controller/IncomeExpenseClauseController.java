/// *** *** Controller :: IncomeExpenseClauseControllerController  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 17:45:45 :: 2014-07-12 17 : 43 :50
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///

package com.valentine1996.pharmacy.controller;


import com.valentine1996.pharmacy.model.entity.DistributionWay;
import com.valentine1996.pharmacy.model.entity.IncomeExpenseClause;
import com.valentine1996.pharmacy.model.service.IncomeExpenseClauseService;
import com.valentine1996.pharmacy.model.service.IncomeExpenseClauseService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

/**
 * Controller for income/expense clause
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/clause")
public class IncomeExpenseClauseController {

    public static final String REDIRECT_CLAUSE_LIST = "redirect:/clause/list";

    @Autowired
    IncomeExpenseClauseService incomeExpenseClauseService;

    /**
     * GET 
     *
     * GET list of income Expense Clause
     *
     * @param model
     * @return String ( clauses )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List <IncomeExpenseClause> clauses = incomeExpenseClauseService.findAll();
        model.addAttribute("clauseList", clauses);

        return "clauses";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createClause";
    }

    /**
     * POST
     *
     * Create income/expense clause
     *
     * @param incomeExpenseClause
     * @return String
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          IncomeExpenseClause incomeExpenseClause,
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createClause";
        }
        try {
            IncomeExpenseClause newIncomeExpenseClause= new IncomeExpenseClause();
            newIncomeExpenseClause.setName(incomeExpenseClause.getName());
            incomeExpenseClauseService.create( newIncomeExpenseClause );
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_CLAUSE_LIST;
    }

    /**
     * Get update form for income/expense clause
     * @param id
     * @param model
     * @return String ( updateClause )
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        IncomeExpenseClause incomeExpenseClause = incomeExpenseClauseService.find(id);
        model.addAttribute("incomeExpenseClause", incomeExpenseClause);
        return "updateClause";
    }


    /**
     * POST
     *
     * Update exist income/expense clause
     *
     * @param incomeExpenseClause
     * @param id
     * @return String ( clause list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID")
                         Long id,
                         @Valid
                         @ModelAttribute
                         IncomeExpenseClause incomeExpenseClause,
                         BindingResult result,
                         ModelMap model){
        IncomeExpenseClause updateClause= incomeExpenseClauseService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("incomeExpenseClause", incomeExpenseClause);
            return "updateClause";
        }
        updateClause.setName( incomeExpenseClause.getName() );

        incomeExpenseClauseService.update( updateClause );
        return REDIRECT_CLAUSE_LIST;
    }

    /**
     * DELETE
     *
     * Delete exist income/expense clause
     *
     * @param id
     */
    @RequestMapping( value = "/{ID}")
    public String delete( @PathVariable("ID") Long id){
        try {
            incomeExpenseClauseService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_CLAUSE_LIST;
    }
}
