/// *** *** Model :: Entity :: Profit *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 15:08:15 :: 2014-07-08 17:15:54
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
 * Class for reflect table profit from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "profit"
)
public class Profit implements Serializable {

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
    @JoinTable( name = "pharmacy_id" )
    protected Pharmacy pharmacy;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "month", length = 16 )
    protected String month;

    @NotNull
    @Column( name = "profit")
    protected Double profit;

    @NotNull
    @Column( name = "PH")
    protected Double PH;

    @NotNull
    @Column( name = "GI")
    protected Double GI;

    @NotNull
    @Column( name = "GI_bonus")
    protected Double GIBonus;

    @NotNull
    @Column( name = "GI_deposit")
    protected Double GIDeposit;

    @NotNull
    @Column( name = "GI_another1")
    protected Double GIAnother1;

    @NotNull
    @Column( name = "GI_another2")
    protected Double GIAnother2;

    @NotNull
    @Column( name = "GI_total")
    protected Double GITotal;

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public Profit() {
    }

    /**
     * Constructor
     *
     * @param year
     * @param pharmacy
     * @param month
     * @param profit
     * @param PH
     * @param GI
     * @param GIBonus
     * @param GIDeposit
     * @param GIAnother1
     * @param GIAnother2
     * @param GITotal
     */
    public Profit(
        Year year,
        Pharmacy pharmacy,
        String month, 
        Double profit, 
        Double PH, 
        Double GI, 
        Double GIBonus, 
        Double GIDeposit, 
        Double GIAnother1, 
        Double GIAnother2, 
        Double GITotal) {
        
        this.year = year;
        this.pharmacy = pharmacy;
        this.month = month;
        this.profit = profit;
        this.PH = PH;
        this.GI = GI;
        this.GIBonus = GIBonus;
        this.GIDeposit = GIDeposit;
        this.GIAnother1 = GIAnother1;
        this.GIAnother2 = GIAnother2;
        this.GITotal = GITotal;
    }

    //- SECTION :: GET -//

    /**
     * Get ID of profit
     *
     * @return Long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Get year of profit
     *
     * @return Year year
     */
    public Year getYearId() {
        return year;
    }

    /**
     * Get pharmacy of profit
     *
     * @return Pharmacy pharmacy
     */
    public Pharmacy getPharmacyId() {
        return pharmacy;
    }

    /**
     * Get month of profit
     *
     * @return String month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Get value of profit
     *
     * @return Double profit
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * Get PH of profit
     *
     * @return Double PH
     */
    public Double getPH() {
        return PH;
    }

    /**
     * Get GREAT INCOME of profit
     *
     * @return Double GI
     */
    public Double getGI() {
        return GI;
    }

    /**
     * Get GET GI + bonus of profit
     *
     * @return Double GI + bonus 
     */
    public Double getGIBonus() {
        return GIBonus;
    }

    /**
     * Get GI + deposit
     *
     * @return Double GI + deposit
     */
    public Double getGIDeposit() {
        return GIDeposit;
    }

    /**
     * Get GI + another1
     *
     * @return Double GI + another1
     */
    public Double getGIAnother1() {
        return GIAnother1;
    }

    /**
     * Get GI + another2
     *
     * @return Double GI + another2
     */
    public Double getGIAnother2() {
        return GIAnother2;
    }

    /**
     * Get GI + total
     *
     * @return Double GI + total
     */
    public Double getGITotal() {
        return GITotal;
    }

    //- SECTION :: SET -//

    /**
     * Set id of profit
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Set year of profit
     *
     * @param year
     */
    public void setYear(Year year) {
        this.year = year;
    }

    /**
     * Set pharmacy of profit
     *
     * @param pharmacy
     */
    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    /**
     * Set month of profit
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * Set value of profit
     *
     * @param profit
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    /**
     * Set PH of profit
     *
     * @param PH
     */
    public void setPH(Double PH) {
        this.PH = PH;
    }

    /**
     * Set GI of profit
     *
     * @param GI
     */
    public void setGI(Double GI) {
        this.GI = GI;
    }

    /**
     * Set GI + bonus of profit
     *
     * @param GIBonus
     */
    public void setGIBonus(Double GIBonus) {
        this.GIBonus = GIBonus;
    }

    /**
     * Set GI + deposit of profit
     *
     * @param GIDeposit
     */
    public void setGIDeposit(Double GIDeposit) {
        this.GIDeposit = GIDeposit;
    }

    /**
     * Set GI + another1 of profit
     *
     * @param GIAnother1
     */
    public void setGIAnother1(Double GIAnother1) {
        this.GIAnother1 = GIAnother1;
    }

    /**
     * Set GI + another2 of profit
     *
     * @param GIAnother2
     */
    public void setGIAnother2(Double GIAnother2) {
        this.GIAnother2 = GIAnother2;
    }

    /**
     * Set total GI of profit
     *
     * @param GITotal
     */
    public void setGITotal(Double GITotal) {
        this.GITotal = GITotal;
    }
}
