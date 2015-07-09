/// *** *** Model :: Service :: PharmacyService *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:28:15 :: 2014-07-09 10:31:05
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Pharmacy;

import java.util.List;

/* Service for work with pharmacy
*
* @version 1.0
*/
public interface PharmacyService {

    //- SECTION :: MAIN -//

    /**
     * Find Pharmacy for page
     *
     * @return List < Pharmacy > List of Pharmacies
     */
    public List < Pharmacy > findAll();

    /**
     * Create
     *
     * @param pharmacy Data for create new Pharmacy
     * @return Created Pharmacy
     */
    public Pharmacy create( Pharmacy pharmacy);

    /**
     * Find Pharmacy by id
     *
     * @param id Unique identificator
     * @return Pharmacy Found
     */
    public Pharmacy find( Long id );

    /**
     * Update
     *
     * @param pharmacy  for update
     * @return Pharmacy Updated
     */
    public Pharmacy update( Pharmacy pharmacy);

    /**
     * Delete
     *
     * @param id Identificator of Pharmacy
     */
    public void delete( Long id );
}
