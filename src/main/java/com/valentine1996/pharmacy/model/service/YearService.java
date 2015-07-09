/// *** *** Model :: Service :: YearService *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 18:03:47 :: 2014-07-08 18:15:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Year;

import java.util.List;

/**
 * Service for work with year
 *
 * @version 1.0
 */

public interface YearService {
    //- SECTION :: MAIN -//
    /**
     * Find styles for page
     *
     * @return List < Year > List of years
     */
    public List < Year > findAll();

    /**
     * Create
     *
     * @param year Data for create new year
     * @return Created year
     */
    public Year create( Year year );

    /**
     * Find year by id
     *
     * @param id Unique identificator
     * @return Year Found
     */
    public Year find( Long id );

    /**
     * Update
     *
     * @param year Year for update
     * @return Year Updated
     */
    public Year update( Year year );

    /**
     * Find year by name
     *
     * @param name
     * @return Year Found
     */
    public Year findByName(Integer name);

    /**
     * Delete
     *
     * @param id Identificator of year
     */
    public void delete( Long id );
}
