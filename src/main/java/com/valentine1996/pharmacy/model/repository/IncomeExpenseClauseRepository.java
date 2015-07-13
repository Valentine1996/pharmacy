/// *** *** Model :: Repository :: IncomeExpenseClauseRepository *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 09:42:45 :: 2014-07-09 09:43:10
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
package com.valentine1996.pharmacy.model.repository;


import com.valentine1996.pharmacy.model.entity.IncomeExpenseClause;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface IncomeExpenseClauseRepository extends JpaRepository  < IncomeExpenseClause,
                                                                       Long > {
    public IncomeExpenseClause findByName(String name);
}
