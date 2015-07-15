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

    /**
     * Get sum of profits
     *
     * @param month
     * @param year
     * @return
     */
    public Double getSumOfProfitByMonthAndYear( String month, Integer year);

    /**
     * Get sum of profits
     *
     * @param month
     * @param year
     * @param legalForm
     * @param consider
     * @return
     */
    public Double getSumOfProfitByMonAndYearAndLegalFormAndCC( String month,
                                                               Integer year,
                                                               String legalForm,
                                                               Boolean consider);

    /**
     * Get count of profit
     *
     * @param month
     * @param year
     * @param legalForm
     * @param consider
     * @return
     */
    public Integer getCountOfProfitByMonAndYearAndLegalFormAndCC(String month,
                                                                Integer year,
                                                                String legalForm,
                                                                Boolean consider);
    /**
     * Get sum of profit
     *
     * @param month
     * @param year
     * @param consider
     * @return
     */
    public Double getSumOfProfitByMonAndYearAndCC(String month,
                                                  Integer year,
                                                  Boolean consider);

    /**
     * Get count of profit
     *
     * @param month
     * @param year
     * @param consider
     * @return
     */
    public Integer getCountOfProfitByMonAndYearAndCC(String month,
                                                    Integer year,
                                                    Boolean consider);

    /**
     * Get profit by month and year
     *
     * @param month
     * @param year
     * @param shortName
     * @return Profit
     */
    public Profit findByMonthAndYearAndPharmacy( String month,
                                                 Integer year, 
                                                 String shortName);
}
