/// *** *** Model :: Service :: ProfitService *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:54:10 :: 2014-07-09 10:57:05
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Profit;

import java.util.List;

/* Service for work with profit
*
* @version 1.0
*/
public interface ProfitService {
    //- SECTION :: MAIN -//
    /**
     * Find Profits for page
     *
     * @return List < Profit > List of Profits
     */
    public List < Profit > findAll();

    /**
     * Create
     *
     * @param profit Data for create new Profit
     * @return Profit Created
     */
    public Profit create( Profit profit);

    /**
     * Find Profit by id
     *
     * @param id Unique identificator
     * @return Profit Found
     */
    public Profit find( Long id );

    /**
     * Update
     *
     * @param profit  for update
     * @return Profit Updated
     */
    public Profit update( Profit profit);

    /**
     * Delete
     *
     * @param id Identificator of Profit
     */
    public void delete( Long id );
}
