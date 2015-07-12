/// ***  Model :: Service :: Implementation :: ProfitServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:59:41 :: 2014-07-09 09:57:21
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */
package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Profit;
import com.valentine1996.pharmacy.model.repository.ProfitRepository;
import com.valentine1996.pharmacy.model.service.ProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of profit service
 *
 * @version 1.0
 */
@Service
public class ProfitServiceImpl implements ProfitService {

    @Autowired
    ProfitRepository profitRepository;

    /**
     * Find Profits for page
     *
     * @return List < Profit > List of Profits
     */
    @Override
    public List<Profit> findAll() {
        return this.profitRepository.findAll();
    }

    /**
     * Create
     *
     * @param profit Data for create new Profit
     * @return Profit Created
     */
    @Override
    public Profit create(Profit profit) {
        return this.profitRepository.save(profit);
    }

    /**
     * Find Profit by id
     *
     * @param id Unique identificator
     * @return Profit Found
     */
    @Override
    public Profit find(Long id) {
        return this.profitRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param profit for update
     * @return Profit Updated
     */
    @Override
    public Profit update(Profit profit) {
        return this.profitRepository.save(profit);
    }

    /**
     * Delete
     *
     * @param id Identificator of Profit
     */
    @Override
    public void delete(Long id) {
        this.profitRepository.delete(id);
    }
}
