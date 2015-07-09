/// *** *** Model :: Service :: Implementation :: YearServiceImpl *** *** *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 18:03:47 :: 2014-07-08 18:15:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***///
package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Year;
import com.valentine1996.pharmacy.model.repository.YearRepository;
import com.valentine1996.pharmacy.model.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Implementation of year service
 *
 * @version 1.0
 */

import java.util.List;

@Service
public class YearServiceImpl implements YearService{

    /// *** Properties  *** ///
    @Autowired
    protected YearRepository yearRepository;
    
    /**
     * Find year for page
     *
     * @return List < Year > List of years
     */
    @Override
    public List < Year > findAll() {
        return this.yearRepository.findAll();
    }

    /**
     * Create
     *
     * @param year Data for creating new year
     * @return Created year
     */
    @Override
    public Year create(Year year) {
        return this.yearRepository.save(year);
    }

    /**
     * Find year by id
     *
     * @param id Unique identificator
     * @return Year Found
     */
    @Override
    public Year find(Long id) {
        return this.yearRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param year Year for update
     * @return Year Updated
     */
    @Override
    public Year update(Year year) {

        return this.yearRepository.save(year);
    }

    /**
     * Find year by name
     *
     * @param name
     * @return Year Found
     */
    @Override
    public Year findByName(Integer name) {
        return this.yearRepository.findByName(name);
    }

    /**
     * Delete
     *
     * @param id Identificator of year
     */
    @Override
    public void delete(Long id) {
        yearRepository.delete(id);
    }
}
