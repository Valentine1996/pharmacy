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

import com.valentine1996.pharmacy.validation.constraint.CheckAcs;
import com.valentine1996.pharmacy.validation.constraint.CheckClause;
import com.valentine1996.pharmacy.validation.constraint.CheckDisway;
import com.valentine1996.pharmacy.validation.constraint.CheckYear;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by valentyn on 7/9/15.
 */
public class ExpenseForm {

    /// *** Properties  *** ///

    protected Long id;

    @NotNull
    @Min(2010)
    @CheckYear
    protected Integer year;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @CheckAcs
    protected String accountingSystem;

    @NotNull
    @NotEmpty
    @Length( max = 32 )
    @CheckDisway
    protected String distributionWay;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @CheckClause
    protected String clause;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    protected String month;

    @NotNull
    @NotEmpty
    @Length( max = 100 )
    protected String name;

    @NotNull
    protected Boolean income;

    @NotNull
    @Range
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
     * @param clause
     * @param month
     * @param name
     * @param income
     * @param sum
     */
    public ExpenseForm(Integer year,
                   String accountingSystem,
                   String distributionWay,
                   String clause,
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


    public Long getId() {
        return id;
    }

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

    public String getClause() {
        return clause;
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

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setClause(String clause) {
        this.clause = clause;
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
