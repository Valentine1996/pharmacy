/// *** *** Model :: Repository :: ExpenseRepository *** *** *** *///

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

import com.valentine1996.pharmacy.model.entity.Expense;
import com.valentine1996.pharmacy.model.help.SimpleExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface ExpenseRepository extends JpaRepository < Expense, Long >{

    /**
     * Get total sum of expense by months and year group by clause
     * 
     * @param months
     * @param year
     * @return
     */
    @Query("SELECT NEW com.valentine1996.pharmacy.model.help.SimpleExpense( " +
        "e.incomeExpenseClause.name, sum(e.sum) )" +
        "FROM Expense e " +
        "WHERE e.month IN :months " +
        "AND e.year.name = :year " +
        "GROUP BY e.incomeExpenseClause.name")
    List < SimpleExpense > getTotalExpenseSumByMonthsAndYearGroupByClause(@Param("months")
                                             List< String > months,
                                             @Param("year") Integer year);
}
