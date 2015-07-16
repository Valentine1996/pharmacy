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
import com.valentine1996.pharmacy.model.help.SimpleProfit;
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

    /**
     * Get sum of profits
     *
     * @param month
     * @param year
     * @return
     */
    @Override
    public Double getSumOfProfitByMonthAndYear(String month, Integer year) {
        return this.profitRepository.getSumOfProfitByMonthAndYear(month, year);
    }

    /**
     * Get sum of profits
     *
     * @param month
     * @param year
     * @param legalForm
     * @return
     */
    @Override
    public Double getSumOfProfitByMonAndYearAndLegalFormAndCC(
                                                         String month,
                                                         Integer year, 
                                                         String legalForm,
                                                         Boolean consider) {
        return this.profitRepository.
            getSumOfProfitByMonAndYearAndLegalFormAndCC(month,
                                                        year,
                                                        legalForm,
                                                        consider);
    }

    /**
     * Get count of profit
     *
     * @param month
     * @param year
     * @param legalForm
     * @param consider
     * @return
     */
    @Override
    public Integer getCountOfProfitByMonAndYearAndLegalFormAndCC(String month,
                                                                Integer year, 
                                                                String legalForm, 
                                                                Boolean consider) {
        return this.profitRepository.
            getCountOfProfitByMonAndYearAndLegalFormAndCC( month,
                                                           year,
                                                           legalForm,
                                                           consider);
    }

    /**
     * Get sum of profit
     *
     * @param month
     * @param year
     * @param consider
     * @return
     */
    @Override
    public Double getSumOfProfitByMonAndYearAndCC(String month, 
                                                  Integer year, 
                                                  Boolean consider) {
        return this.profitRepository.
            getSumOfProfitByMonAndYearAndCC( month, 
                                             year,
                                             consider);
    }

    /**
     * Get count of profit
     *
     * @param month
     * @param year
     * @param consider
     * @return
     */
    @Override
    public Integer getCountOfProfitByMonAndYearAndCC(String month, 
                                                     Integer year, 
                                                     Boolean consider) {
        return this.profitRepository.
            getCountOfProfitByMonAndYearAndCC( month,
                                               year,
                                               consider);
    }

    /**
     * Get profit by month and year
     *
     * @param month
     * @param year
     * @param shortName
     * @return Profit
     */
    @Override
    public Profit findByMonthAndYearAndPharmacy(String month,
                                                Integer year, 
                                                String shortName) {
        return this.profitRepository.
            findByMonthAndYearAndPharmacy( month, year, shortName);
    }

    /**
     * Get total sums by month and year group by pharmacy short name
     *
     * @param months
     * @param year
     * @return
     */
    @Override
    public List <SimpleProfit> getSumsByMonthsAndYearGroupByPhShortName(List<String> months, 
                                                                        Integer year) {
        return this.profitRepository.
            getSumsByMonthsAndYearGroupByPhShortName(months, year);
    }

    /**
     * Get sum of profit parameters by months and year
     *
     * @param months
     * @param year
     * @return
     */
    @Override
    public SimpleProfit getSumsByMonthsAndYear(List<String> months, Integer year) {
        return this.profitRepository.getSumsByMonthsAndYear(months, year);
    }

    /**
     * Get sum of profit parameters by months and year Group By legal form
     *
     * @param months
     * @param year
     * @return
     */
    @Override
    public List<SimpleProfit> getSumsByMonthsAndYearGroupByLegalForm(List<String> months, 
                                                                     Integer year) {
        return this.profitRepository.
            getSumsByMonthsAndYearGroupByLegalForm(months, year);
    }

    /**
     * Get sum of profit parameters by months and year and legal form group by short name
     *
     * @param months
     * @param year
     * @param legalForm
     * @return
     */
    @Override
    public List<SimpleProfit> getSumsByMonthsAndYearAndLegalFormGroupByPhShortName(List<String> months, 
                                                                                   Integer year, 
                                                                                   String legalForm) {
        return this.profitRepository.
            getSumsByMonthsAndYearAndLegalFormGroupByPhShortName( months,
                                                                  year,
                                                                  legalForm);
    }
}
