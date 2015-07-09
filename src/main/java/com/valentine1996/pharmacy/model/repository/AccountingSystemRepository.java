/// *** *** Model :: Repository :: AccountingSystemRepository *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 08:59:55 :: 2014-07-09 09:04:45
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
package com.valentine1996.pharmacy.model.repository;

import com.valentine1996.pharmacy.model.entity.AccountingSystem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface AccountingSystemRepository extends JpaRepository < AccountingSystem, Long > {

}
