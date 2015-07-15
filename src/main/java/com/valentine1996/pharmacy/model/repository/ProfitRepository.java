/// *** *** Model :: Repository :: ProfitRepository *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 10:42:30 :: 2014-07-09 10:26:10
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
package com.valentine1996.pharmacy.model.repository;

import com.valentine1996.pharmacy.model.entity.Profit;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface for work with persistence layout
 *
 * @version 1.0
 */
public interface ProfitRepository extends JpaRepository <Profit, Long>{

    @Query(value = 
        "SELECT SUM(p.profit ) " +
        "FROM  Profit p JOIN p.year y " +
        "WHERE p.month = :month AND y.name = :year")
    Double getSumOfProfitByMonthAndYear(@Param("month")
                                        String month,
                                        @Param("year") Integer year);

    @Query(value =
        "SELECT SUM(p.profit) " +
            "FROM  Profit p " +
            "JOIN p.year y " +
            "JOIN p.pharmacy ph " +
            "WHERE p.month = :month " +
            "AND y.name = :year " +
            "AND ph.calculationConsider = :consider")
    Double getSumOfProfitByMonAndYearAndCC(@Param("month") String month,
                                           @Param("year") Integer year,
                                           @Param(("consider")) Boolean consider);

    @Query(value =
        "SELECT COUNT(p) " +
            "FROM  Profit p " +
            "JOIN p.year y " +
            "JOIN p.pharmacy ph " +
            "WHERE p.month = :month " +
            "AND y.name = :year " +
            "AND ph.calculationConsider = :consider")
    Integer getCountOfProfitByMonAndYearAndCC(@Param("month") String month,
                                           @Param("year") Integer year,
                                           @Param(("consider")) Boolean consider);

    @Query("SELECT SUM(p.profit) " +
        "FROM  Profit p " +
        "JOIN p.year y " +
        "JOIN p.pharmacy ph " +
        "WHERE p.month = :month " +
        "AND y.name = :year " +
        "AND ph.legalForm = :legalForm " +
        "AND ph.calculationConsider = :consider")
    Double getSumOfProfitByMonAndYearAndLegalFormAndCC(
                                        @Param("month") String month,
                                        @Param("year") Integer year,
                                        @Param("legalForm") String legalForm,
                                        @Param(("consider")) Boolean consider);

    @Query( "SELECT COUNT(p) " +
            "FROM  Profit p " +
            "JOIN p.year y " +
            "JOIN p.pharmacy ph " +
            "WHERE p.month = :month " +
            "AND y.name = :year " +
            "AND ph.legalForm = :legalForm " +
            "AND ph.calculationConsider = :consider")
    Integer getCountOfProfitByMonAndYearAndLegalFormAndCC(
                                        @Param("month") String month,
                                        @Param("year") Integer year,
                                        @Param("legalForm") String legalForm,
                                        @Param(("consider")) Boolean consider);


    @Query("SELECT p " +
        "FROM Profit p FETCH ALL PROPERTIES " +
        "WHERE p.pharmacy.shortName = :shortName " +
        "AND p.month = :month " +
        "AND p.year.name = :year")
    Profit findByMonthAndYearAndPharmacy(
                                   @Param("month")
                                   String month,
                                   @Param("year") Integer year,
                                   @Param("shortName") String shortName);
    
    //* Profit Income Filter*//

    /**
     * Get sum of profit by months and year
     * @param months
     * @param year
     * @return
     */
    @Query(value =
        "SELECT SUM(p.profit ) " +
            "FROM  Profit p JOIN p.year y " +
            "WHERE p.month IN :month AND y.name = :year")
    Double getSumOfProfitByMonthsAndYear(@Param("month")
                                         List < String > months,
                                        @Param("year") Integer year);

    /**
     * Get GI of profit by months and year
     * @param months
     * @param year
     * @return
     */
    @Query(value =
        "SELECT SUM(p.GI ) " +
            "FROM  Profit p JOIN p.year y " +
            "WHERE p.month IN :month AND y.name = :year")
    Double getSumOfGIByMonthsAndYear(@Param("month")
                                         List < String > months,
                                         @Param("year") Integer year);

    /**
     * Get GIBonus of profit by months and year
     * @param months
     * @param year
     * @return
     */
    @Query(value =
        "SELECT SUM(p.GIBonus ) " +
            "FROM  Profit p JOIN p.year y " +
            "WHERE p.month IN :month AND y.name = :year")
    Double getSumOfGIBonusByMonthsAndYear(@Param("month")
                                     List < String > months,
                                     @Param("year") Integer year);
}
