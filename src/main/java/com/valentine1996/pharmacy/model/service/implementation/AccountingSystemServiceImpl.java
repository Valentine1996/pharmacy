/// ***  Model :: Service :: Implementation :: AccountingSystemServiceImpl *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:10:47 :: 2014-07-08 09:20:21
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw */

package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import com.valentine1996.pharmacy.model.repository.AccountingSystemRepository;
import com.valentine1996.pharmacy.model.service.AccountingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of accounting system service
 *
 * @version 1.0
 */
@Service
public class AccountingSystemServiceImpl implements AccountingSystemService {

    @Autowired
    AccountingSystemRepository accountingSystemRepository;
    /**
     * Find accounting systems for page
     *
     * @return List < Year > List of years
     */
    @Override
    public List < AccountingSystem > findAll() {
        return this.accountingSystemRepository.findAll();
    }

    /**
     * Create
     *
     * @param accountingSystem Data for creating new Accounting System
     * @return Created Accounting System
     */
    @Override
    public AccountingSystem create(AccountingSystem accountingSystem) {
        return this.accountingSystemRepository.save(accountingSystem);
    }

    /**
     * Find Accounting System by id
     *
     * @param id Unique identificator
     * @return Accounting System Found
     */
    @Override
    public AccountingSystem find(Long id) {
        return this.accountingSystemRepository.findOne(id);
    }

    /**
     * Find accounting system by name
     *
     * @param name
     * @return Accounting System Found
     */
    @Override
    public AccountingSystem findByName(String name) {
        return this.accountingSystemRepository.findByName(name);
    }

    /**
     * Update
     *
     * @param accountingSystem Accounting System for update
     * @return AccountingSystem Updated
     */
    @Override
    public AccountingSystem update(AccountingSystem accountingSystem) {
        return this.accountingSystemRepository.save(accountingSystem);
    }

    /**
     * Delete
     *
     * @param id Identificator of Accounting System
     */
    @Override
    public void delete(Long id) {
        this.accountingSystemRepository.delete(id);
    }
}
