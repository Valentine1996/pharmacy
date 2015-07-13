/// *** *** Model :: Entity :: Expense *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 17:16:31 :: 2014-07-09 20:26:54
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
/**
 * Class for reflect table expense from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "expense"
)
public class Expense implements Serializable {

    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "year_id" )
    protected Year year;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "accounting_system_id" )
    protected AccountingSystem accountingSystem;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "distribution_way_id" )
    protected DistributionWay distributionWay;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "income_expense_clause_id" )
    protected IncomeExpenseClause incomeExpenseClause;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "month", length = 16 )
    protected String month;

    @NotNull
    @NotEmpty
    @Length( max = 100 )
    @Column( name = "name", length = 100 )
    protected String name;
    
    @NotNull 
    @Column( name = "income")
    protected Boolean income;
    
    @NotNull
    @Column( name = "sum")
    protected Double sum;

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public Expense() {
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
    public Expense(Year year, 
                   AccountingSystem accountingSystem, 
                   DistributionWay distributionWay, 
                   IncomeExpenseClause incomeExpenseClause,
                   String month, String name, 
                   Boolean income, 
                   Double sum) {
        this.year = year;
        this.accountingSystem = accountingSystem;
        this.distributionWay = distributionWay;
        this.incomeExpenseClause = incomeExpenseClause;
        this.month = month;
        this.name = name;
        this.income = income;
        this.sum = sum;
    }

    //- SECTION :: GET -//

    /**
     * Get ID of expense
     *
     * @return Long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Get year of expense
     *
     * @return Year 
     */
    public Year getYear() {
        return year;
    }

    /**
     * Get accounting system of expense
     *
     * @return AccountingSystem
     */
    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    /**
     * Get distribution way of expense
     *
     * @return DistributionWay
     */
    public DistributionWay getDistributionWay() {
        return distributionWay;
    }

    public IncomeExpenseClause getIncomeExpenseClause() {
        return incomeExpenseClause;
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
     * Set id of expense
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Set year of expense
     *
     * @param year
     */
    public void setYear(Year year) {
        this.year = year;
    }

    /**
     * Set accounting system of expense
     *
     * @param accountingSystem
     */
    public void setAccountingSystem(AccountingSystem accountingSystem) {
        this.accountingSystem = accountingSystem;
    }

    /**
     * Set distribution way of expense
     *
     * @param distributionWay
     */
    public void setDistributionWay(DistributionWay distributionWay) {
        this.distributionWay = distributionWay;
    }

    public void setIncomeExpenseClause(IncomeExpenseClause incomeExpenseClause) {
        this.incomeExpenseClause = incomeExpenseClause;
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
