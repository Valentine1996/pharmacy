/// ***  Model :: Service :: Implementation :: IncomeExpenseClauseServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:14:41 :: 2014-07-09 10:19:40
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */
package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.IncomeExpenseClause;
import com.valentine1996.pharmacy.model.repository.IncomeExpenseClauseRepository;
import com.valentine1996.pharmacy.model.service.IncomeExpenseClauseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Implementation of income/expense clause service
 *
 * @version 1.0
 */
public class IncomeExpenseClauseServiceImpl implements IncomeExpenseClauseService {

    @Autowired
    IncomeExpenseClauseRepository incomeExpenseClauseRepository;
    /**
     * Find Income Expense Clause for page
     *
     * @return List < IncomeExpenseClause  > List of Income Expense Clauses
     */
    @Override
    public List < IncomeExpenseClause > findAll() {
        return this.incomeExpenseClauseRepository.findAll();
    }

    /**
     * Create
     *
     * @param incomeExpenseClause Data for create new IncomeExpenseClause
     * @return Created IncomeExpenseClause
     */
    @Override
    public IncomeExpenseClause create(IncomeExpenseClause incomeExpenseClause) {
        return this.incomeExpenseClauseRepository.save(incomeExpenseClause);
    }

    /**
     * Find IncomeExpenseClause  by id
     *
     * @param id Unique identificator
     * @return IncomeExpenseClause  Found
     */
    @Override
    public IncomeExpenseClause find(Long id) {
        return this.incomeExpenseClauseRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param incomeExpenseClause for update
     * @return IncomeExpenseClause  Updated
     */
    @Override
    public IncomeExpenseClause update(IncomeExpenseClause incomeExpenseClause) {
        return this.incomeExpenseClauseRepository.save(incomeExpenseClause);
    }

    /**
     * Delete
     *
     * @param id Identificator of IncomeExpenseClause
     */
    @Override
    public void delete(Long id) {
        this.incomeExpenseClauseRepository.delete(id);
    }
}
