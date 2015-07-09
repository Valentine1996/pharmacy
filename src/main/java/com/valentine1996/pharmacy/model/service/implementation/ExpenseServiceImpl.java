/// ***  Model :: Service :: Implementation :: ExpenseServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:53:41 :: 2014-07-09 09:57:21
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */

package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Expense;
import com.valentine1996.pharmacy.model.repository.ExpenseRepository;
import com.valentine1996.pharmacy.model.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Implementation of expense service
 *
 * @version 1.0
 */
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    ExpenseRepository expenseRepository;
    /**
     * Find Expense for page
     *
     * @return List < Expense > List of Expenses
     */
    @Override
    public List < Expense > findAll() {
        return this.expenseRepository.findAll();
    }

    /**
     * Create
     *
     * @param expense Data for create new Expense
     * @return Created Expense
     */
    @Override
    public Expense create(Expense expense) {
        return this.expenseRepository.save(expense);
    }

    /**
     * Find Expense by id
     *
     * @param id Unique identificator
     * @return Expense Found
     */
    @Override
    public Expense find(Long id) {
        return this.expenseRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param expense Expense for update
     * @return Expense Updated
     */
    @Override
    public Expense update(Expense expense) {
        return this.expenseRepository.save(expense);
    }

    /**
     * Delete
     *
     * @param id Identificator of Expense
     */
    @Override
    public void delete(Long id) {
        this.expenseRepository.delete(id);
    }
}
