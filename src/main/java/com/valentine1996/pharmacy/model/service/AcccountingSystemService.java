/// *** *** Model :: Service :: AccountingSystemService *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:06:15 :: 2014-07-09 09:10:05
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.AccountingSystem;

import java.util.List;

public interface AcccountingSystemService {
    
    //- SECTION :: MAIN -//
    /**
     * Find styles for page
     *
     * @return List < AccountingSystem > List of years
     */
    public List < AccountingSystem > findAll();

    /**
     * Create
     *
     * @param accountingSystem Data for create new Accounting System
     * @return Created Accounting System
     */
    public AccountingSystem create( AccountingSystem accountingSystem );

    /**
     * Find AccountingSystem by id
     *
     * @param id Unique identificator
     * @return Accounting System Found
     */
    public AccountingSystem find( Long id );

    /**
     * Update
     *
     * @param accountingSystem Accounting System for update
     * @return AccountingSystem Updated
     */
    public AccountingSystem update( AccountingSystem accountingSystem );

    /**
     * Delete
     *
     * @param id Identificator of Accounting System
     */
    public void delete( Long id );
}
