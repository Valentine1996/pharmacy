/// ***  Model :: Service :: Implementation :: PharmacyServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:53:41 :: 2014-07-09 09:57:21
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */

package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Pharmacy;
import com.valentine1996.pharmacy.model.repository.PharmacyRepository;
import com.valentine1996.pharmacy.model.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of pharmacy service
 *
 * @version 1.0
 */
@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    PharmacyRepository pharmacyRepository;

    /**
     * Find Pharmacy for page
     *
     * @return List < Pharmacy > List of Pharmacies
     */
    @Override
    public List < Pharmacy > findAll() {
        return this.pharmacyRepository.findAll();
    }

    /**
     * Create
     *
     * @param pharmacy Data for create new Pharmacy
     * @return Created Pharmacy
     */
    @Override
    public Pharmacy create(Pharmacy pharmacy) {
        return this.pharmacyRepository.save(pharmacy);
    }

    /**
     * Find Pharmacy by id
     *
     * @param id Unique identificator
     * @return Pharmacy Found
     */
    @Override
    public Pharmacy find(Long id) {
        return this.pharmacyRepository.findOne(id);
    }

    /**
     * Find Pharmacy by short name
     *
     * @param name Unique identificator
     * @return Pharmacy Found
     */
    @Override
    public Pharmacy findByShortName(String name){
        return this.pharmacyRepository.findByShortName(name);
    }
    /**
     * Update
     *
     * @param pharmacy for update
     * @return Pharmacy Updated
     */
    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        return this.pharmacyRepository.save(pharmacy);
    }

    /**
     * Delete
     *
     * @param id Identificator of Pharmacy
     */
    @Override
    public void delete(Long id) {
        this.pharmacyRepository.delete(id);
    }
}
