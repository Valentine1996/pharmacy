/// *** *** Model :: Repository :: PharmacyRepository *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:21:45 :: 2014-07-09 10:26:10
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

package com.valentine1996.pharmacy.model.repository;

import com.valentine1996.pharmacy.model.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface PharmacyRepository extends JpaRepository < Pharmacy, Long> {
}
