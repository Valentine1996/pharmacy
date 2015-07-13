/// *** *** Model :: Service :: DistributionWayService *** *** *** *** *** *///

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

import com.valentine1996.pharmacy.model.entity.DistributionWay;

import java.util.List;

public interface DistributionWayService {
    //- SECTION :: MAIN -//
    /**
     * Find Distribution Ways for page
     *
     * @return List < DistributionWay > List of Distribution Ways
     */
    public List < DistributionWay > findAll();

    /**
     * Create
     *
     * @param distributionWay Data for create new Distribution Way
     * @return Created Distribution Way
     */
    public DistributionWay create( DistributionWay distributionWay);

    /**
     * Find Distribution Way by id
     *
     * @param id Unique identificator
     * @return Distribution Way Found
     */
    public DistributionWay find( Long id );

    /**
     * Find Distribution Way by name
     *
     * @param name Unique identificator
     * @return Distribution Way Found
     */
    public DistributionWay findByName( String name);
    /**
     * Update
     *
     * @param distributionWay Distribution Way for update
     * @return DistributionWay Updated
     */
    public DistributionWay update( DistributionWay distributionWay);

    /**
     * Delete
     *
     * @param id Identificator of Distribution Way
     */
    public void delete( Long id );
}
