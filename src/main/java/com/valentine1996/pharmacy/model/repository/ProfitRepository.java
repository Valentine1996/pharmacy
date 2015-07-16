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
import com.valentine1996.pharmacy.model.help.SimpleProfit;
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

    //- For calculation coefficient -//
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
     * Get sum of profit parameters by months and year and group by pharmacy's short name
     * @param months
     * @param year
     * @return
     */
    @Query("SELECT NEW com.valentine1996.pharmacy.model.help.SimpleProfit (p.pharmacy.shortName, " +
        "sum(p.profit), sum(p.GI), sum(p.GIBonus), sum(p.GIDeposit), " +
        "sum(p.GIAnother1), sum(p.GIAnother2) )" +
        "FROM Profit p FETCH ALL PROPERTIES " +
        "WHERE p.month IN :months " +
        "AND p.year.name = :year " +
        "GROUP BY p.pharmacy.shortName")
    List < SimpleProfit > getSumsByMonthsAndYearGroupByPhShortName(
        @Param("months")
        List< String > months,
        @Param("year") Integer year);

    /**
     * Get sum of profit parameters by months and year
     * @param months
     * @param year
     * @return
     */
    @Query("SELECT NEW com.valentine1996.pharmacy.model.help.SimpleProfit(" +
        "sum(p.profit), sum(p.GI), sum(p.GIBonus), sum(p.GIDeposit), " +
        "sum(p.GIAnother1), sum(p.GIAnother2) )" +
        "FROM Profit p FETCH ALL PROPERTIES " +
        "WHERE p.month IN :months " +
        "AND p.year.name = :year")
    SimpleProfit getSumsByMonthsAndYear(
        @Param("months")
        List< String > months,
        @Param("year") Integer year);

    /**
     * Get sum of profit parameters by months and year Group by legal form
     * @param months
     * @param year
     * @return
     */
    @Query("SELECT NEW com.valentine1996.pharmacy.model.help.SimpleProfit(p.pharmacy.legalForm," +
        "sum(p.profit), sum(p.GI), sum(p.GIBonus), sum(p.GIDeposit), " +
        "sum(p.GIAnother1), sum(p.GIAnother2) )" +
        "FROM Profit p FETCH ALL PROPERTIES " +
        "WHERE p.month IN :months " +
        "AND p.year.name = :year " +
        "GROUP BY p.pharmacy.legalForm ")
    List < SimpleProfit > getSumsByMonthsAndYearGroupByLegalForm(
                                            @Param("months")
                                            List< String > months,
                                            @Param("year") Integer year);

    /**
     * Get sum of profit parameters by months and year and legal form group by short name
     * @param months
     * @param year
     * @return
     */
    @Query("SELECT NEW com.valentine1996.pharmacy.model.help.SimpleProfit (p.pharmacy.shortName, " +
        "sum(p.profit), sum(p.GI), sum(p.GIBonus), sum(p.GIDeposit), " +
        "sum(p.GIAnother1), sum(p.GIAnother2) )" +
        "FROM Profit p FETCH ALL PROPERTIES " +
        "WHERE p.month IN :months " +
        "AND p.year.name = :year " +
        "AND p.pharmacy.legalForm = :legalForm " +
        "GROUP BY p.pharmacy.shortName")
    List < SimpleProfit > getSumsByMonthsAndYearAndLegalFormGroupByPhShortName(
        @Param("months")
        List< String > months,
        @Param("year") Integer year,
        @Param("legalForm") String legalForm);

    

}
