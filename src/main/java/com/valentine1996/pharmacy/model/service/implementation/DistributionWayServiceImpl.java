/// ***  Model :: Service :: Implementation :: DistributionWayServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:33:41 :: 2014-07-08 09:20:21
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */

package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.DistributionWay;
import com.valentine1996.pharmacy.model.repository.DistributionWayRepository;
import com.valentine1996.pharmacy.model.service.DistributionWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of distribution way service
 *
 * @version 1.0
 */
@Service
public class DistributionWayServiceImpl implements DistributionWayService {

    @Autowired
    DistributionWayRepository distributionWayRepository;
    /**
     * Find Distribution Ways for page
     *
     * @return List < DistributionWay > List of Distribution Ways
     */
    @Override
    public List < DistributionWay > findAll() {
        return this.distributionWayRepository.findAll();
    }

    /**
     * Create
     *
     * @param distributionWay Data for create new Distribution Way
     * @return Created Distribution Way
     */
    @Override
    public DistributionWay create(DistributionWay distributionWay) {
        return this.distributionWayRepository.save(distributionWay);
    }

    /**
     * Find Distribution Way by id
     *
     * @param id Unique identificator
     * @return Distribution Way Found
     */
    @Override
    public DistributionWay find(Long id) {
        return this.distributionWayRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param distributionWay Distribution Way for update
     * @return DistributionWay Updated
     */
    @Override
    public DistributionWay update(DistributionWay distributionWay) {
        return this.distributionWayRepository.save(distributionWay);
    }

    /**
     * Delete
     *
     * @param id Identificator of Distribution Way
     */
    @Override
    public void delete(Long id) {
        this.distributionWayRepository.delete(id);
    }
}
