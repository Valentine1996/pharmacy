/// *** *** Model :: Service :: ExpenseService *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:25:15 :: 2014-07-09 09:29:05
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Expense;

import java.util.List;

/* Service for work with expense
*
* @version 1.0
*/
public interface ExpenseService {
    //- SECTION :: MAIN -//
    /**
     * Find Expense for page
     *
     * @return List < Expense > List of Expenses
     */
    public List < Expense > findAll();

    /**
     * Create
     *
     * @param expense Data for create new Expense
     * @return Created Expense
     */
    public Expense create( Expense expense);

    /**
     * Find Expense by id
     *
     * @param id Unique identificator
     * @return Expense Found
     */
    public Expense find( Long id );

    /**
     * Update
     *
     * @param expense Distribution Way for update
     * @return DistributionWay Updated
     */
    public Expense update( Expense expense);

    /**
     * Delete
     *
     * @param id Identificator of Distribution Way
     */
    public void delete( Long id );
}
