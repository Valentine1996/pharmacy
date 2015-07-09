/// *** *** Model :: Form :: ExpenseForm *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-09 20:27:45 :: 2014-07-09 20:26:54
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.view.form;

import com.valentine1996.pharmacy.validation.constraint.CheckYear;

/**
 * Created by valentyn on 7/9/15.
 */
public class ExpenseForm {

    /// *** Properties  *** ///

    @CheckYear
    protected Integer year;

    protected String accountingSystem;

    protected String distributionWay;

    protected String month;

    protected String name;

    protected Boolean income;

    protected Double sum;

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public ExpenseForm() {
    }

    /**
     * Constructor
     *
     * @param year
     * @param accountingSystem
     * @param distributionWay
     * @param month
     * @param name
     * @param income
     * @param sum
     */
    public ExpenseForm(Integer year,
                   String accountingSystem,
                   String distributionWay,
                   String month, String name,
                   Boolean income,
                   Double sum) {
        this.year = year;
        this.accountingSystem = accountingSystem;
        this.distributionWay = distributionWay;
        this.month = month;
        this.name = name;
        this.income = income;
        this.sum = sum;
    }

    //- SECTION :: GET -//

    /**
     * Get year of expense
     *
     * @return Year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Get accounting system of expense
     *
     * @return String accountingSystem
     */
    public String getAccountingSystem() {
        return accountingSystem;
    }

    /**
     * Get distribution way of expense
     *
     * @return String distributionWay
     */
    public String getDistributionWay() {
        return distributionWay;
    }

    /**
     * Get month of expense
     *
     * @return String month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Get name of expense
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Get if income
     *
     * @return Boolean income
     */
    public Boolean getIncome() {
        return income;
    }

    /**
     * Get sum of expense
     *
     * @return Double sum
     */
    public Double getSum() {
        return sum;
    }

    //- SECTION :: SET -//

    /**
     * Set year of expense
     *
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Set accounting system of expense
     *
     * @param accountingSystem
     */
    public void setAccountingSystem(String accountingSystem) {
        this.accountingSystem = accountingSystem;
    }

    /**
     * Set distribution way of expense
     *
     * @param distributionWay
     */
    public void setDistributionWay(String distributionWay) {
        this.distributionWay = distributionWay;
    }

    /**
     * Set month of expense
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * Set name of expense
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set income of expense
     *
     * @param income
     */
    public void setIncome(Boolean income) {
        this.income = income;
    }

    /**
     * Set sum of expense
     *
     * @param sum
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }
}