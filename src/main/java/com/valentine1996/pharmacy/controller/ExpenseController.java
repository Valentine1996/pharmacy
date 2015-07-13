/// *** *** Controller :: ExpenseController  *** *** *** *** *** *** *///

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


import com.valentine1996.pharmacy.model.entity.*;
import com.valentine1996.pharmacy.model.service.*;
import com.valentine1996.pharmacy.view.form.ExpenseForm;
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
 * Controller for expense
 *
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/expense")
public class ExpenseController {

    public static final String REDIRECT_EXPENSE_LIST = "redirect:/expense/list";

    @Autowired
    ExpenseService expenseService;

    @Autowired
    YearService yearService;

    @Autowired
    AccountingSystemService accountingSystemService;

    @Autowired
    IncomeExpenseClauseService clauseService;

    @Autowired
    DistributionWayService distributionWayService;
    /**
     * GET list of expenses
     *
     * @param model
     * @return String ( expenses )
     */
    @RequestMapping( value="/list" )
    public String shopListPage(ModelMap model) {
        List < Expense > expenses = expenseService.findAll();
        model.addAttribute("expenses", expenses);

        return "expenses";
    }

    @RequestMapping(value = "/createForm")
    public String getCreatePage(){
        return "createExpense";
    }
    /**
     * POST
     *
     * Create new expense
     *
     * @param expenseForm
     * @return String ( expenses list )
     */
    @RequestMapping( value = "/", method = RequestMethod.POST)
    public String create( @Valid
                          @ModelAttribute
                          ExpenseForm expenseForm,
                          BindingResult result ){

        if (result.hasErrors()) {
            return "createExpense";
        }
        try {
            //- Create full expense-//
            Expense newExpense = new Expense();
            //- Find expense year and add to expense-//
            Year year = yearService.findByName(expenseForm.getYear());
            newExpense.setYear(year);
            //- Find expense accounting system and add to expense-//
            AccountingSystem accountingSystem 
                = accountingSystemService.findByName(expenseForm.getAccountingSystem());
            newExpense.setAccountingSystem(accountingSystem);
            //- Find expense distribution way and add to expense-//
            DistributionWay distributionWay 
                = distributionWayService.findByName(expenseForm.getDistributionWay());
            newExpense.setDistributionWay(distributionWay);
            //- Find expense clause and add to expense-//
            IncomeExpenseClause clause 
                = clauseService.findByName(expenseForm.getClause());
            newExpense.setIncomeExpenseClause(clause);
            //-Add other primitive fields-//
            newExpense.setMonth(expenseForm.getMonth());
            newExpense.setName(expenseForm.getName());
            newExpense.setIncome(expenseForm.getIncome());
            newExpense.setSum(expenseForm.getSum());
            expenseService.create(newExpense);
        }
        catch( Exception e){
            Error error;

        }
        return REDIRECT_EXPENSE_LIST;
    }

    /**
     * Get update form for expense
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateForm/{ID}")
    public String getUpdatePage(
        @PathVariable("ID") Long id,
        ModelMap model){
        Expense expense = expenseService.find(id);
        //-Create data for form in update jsp (expenseForm) -//
        ExpenseForm expenseForm = new ExpenseForm();
        expenseForm.setId(expense.getId());
        expenseForm.setAccountingSystem(expense.getAccountingSystem().getName());
        expenseForm.setYear(expense.getYear().getName());
        expenseForm.setDistributionWay(expense.getDistributionWay().getName());
        expenseForm.setClause(expense.getIncomeExpenseClause().getName());
        expenseForm.setMonth(expense.getMonth());
        expenseForm.setName(expense.getName());
        expenseForm.setIncome(expense.getIncome());

        model.addAttribute("expenseForm", expenseForm);
        return "updateExpense";
    }


    /**
     * POST
     *
     * Update exist expense
     *
     * @param expenseForm
     * @param id
     * @return String ( expenses list )
     */
    @RequestMapping( value = "/update/{ID}", method = RequestMethod.POST)
    public String update(@PathVariable("ID") Long id,
                         @Valid
                         @ModelAttribute
                         ExpenseForm expenseForm,
                         BindingResult result,
                         ModelMap model){
        Expense updatedExpense= expenseService.find(id);

        if (result.hasErrors()) {
            model.addAttribute("expenseForm", expenseForm);
            return "updateExpense";
        }
        //- Find expense year and add to expense-//
        Year year = yearService.findByName(expenseForm.getYear());
        updatedExpense.setYear(year);
        //- Find expense accounting system and add to expense-//
        AccountingSystem accountingSystem
            = accountingSystemService.findByName(expenseForm.getAccountingSystem());
        updatedExpense.setAccountingSystem(accountingSystem);
        //- Find expense distribution way and add to expense-//
        DistributionWay distributionWay
            = distributionWayService.findByName(expenseForm.getDistributionWay());
        updatedExpense.setDistributionWay(distributionWay);
        //- Find expense clause and add to expense-//
        IncomeExpenseClause clause
            = clauseService.findByName(expenseForm.getClause());
        updatedExpense.setIncomeExpenseClause(clause);
        //-Add other primitive fields-//
        updatedExpense.setMonth(expenseForm.getMonth());
        updatedExpense.setName(expenseForm.getName());
        updatedExpense.setIncome(expenseForm.getIncome());
        updatedExpense.setSum(expenseForm.getSum());

        expenseService.update(updatedExpense);
        return REDIRECT_EXPENSE_LIST;
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
            expenseService.delete(id);
        }
        catch( ConstraintViolationException e){
            Error error;
        }
        return REDIRECT_EXPENSE_LIST;
    }
}
