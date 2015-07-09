/// *** *** Model :: Service :: IncomeExpenseClauseService *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:04:15 :: 2014-07-09 10:12:05
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;


import com.valentine1996.pharmacy.model.entity.IncomeExpenseClause;

import java.util.List;

/* Service for work with income/expense clause
*
* @version 1.0
*/
public interface IncomeExpenseClauseService {

    //- SECTION :: MAIN -//
    /**
     * Find Income Expense Clause for page
     *
     * @return List < IncomeExpenseClause  > List of Income Expense Clauses
     */
    public List < IncomeExpenseClause > findAll();

    /**
     * Create
     *
     * @param incomeExpenseClause Data for create new IncomeExpenseClause
     * @return Created IncomeExpenseClause
     */
    public IncomeExpenseClause  create( IncomeExpenseClause incomeExpenseClause);

    /**
     * Find IncomeExpenseClause  by id
     *
     * @param id Unique identificator
     * @return IncomeExpenseClause  Found
     */
    public IncomeExpenseClause  find( Long id );

    /**
     * Update
     *
     * @param incomeExpenseClause  for update
     * @return IncomeExpenseClause  Updated
     */
    public IncomeExpenseClause  update( IncomeExpenseClause  incomeExpenseClause);

    /**
     * Delete
     *
     * @param id Identificator of IncomeExpenseClause
     */
    public void delete( Long id );
}
