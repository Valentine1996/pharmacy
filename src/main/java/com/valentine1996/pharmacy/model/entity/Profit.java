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
import org.hibernate.validator.constraints.Range;

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
    @JoinColumn( name = "pharmacy_id" )
    protected Pharmacy pharmacy;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "month", length = 16 )
    protected String month;

    @Range
    @Column( name = "profit")
    protected double profit;

    @Range
    @Column( name = "PH")
    protected double PH;

    @Range
    @Column( name = "GI")
    protected double GI;

    @Range
    @Column( name = "GI_bonus")
    protected double GIBonus;

    @Range
    @Column( name = "GI_deposit")
    protected double GIDeposit;

    @Range
    @Column( name = "GI_another1")
    protected double GIAnother1;

    @Range
    @Column( name = "GI_another2")
    protected double GIAnother2;

    @Range
    @Column( name = "GI_total")
    protected double GITotal;

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
        double profit,
        double PH,
        double GI,
        double GIBonus,
        double GIDeposit,
        double GIAnother1,
        double GIAnother2,
        double GITotal) {
        
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
    public Year getYear() {
        return year;
    }

    /**
     * Get pharmacy of profit
     *
     * @return Pharmacy pharmacy
     */
    public Pharmacy getPharmacy() {
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
    public double getProfit() {
        return profit;
    }

    /**
     * Get PH of profit
     *
     * @return Double PH
     */
    public double getPH() {
        return PH;
    }

    /**
     * Get GREAT INCOME of profit
     *
     * @return Double GI
     */
    public double getGI() {
        return GI;
    }

    /**
     * Get GET GI + bonus of profit
     *
     * @return Double GI + bonus 
     */
    public double getGIBonus() {
        return GIBonus;
    }

    /**
     * Get GI + deposit
     *
     * @return Double GI + deposit
     */
    public double getGIDeposit() {
        return GIDeposit;
    }

    /**
     * Get GI + another1
     *
     * @return Double GI + another1
     */
    public double getGIAnother1() {
        return GIAnother1;
    }

    /**
     * Get GI + another2
     *
     * @return Double GI + another2
     */
    public double getGIAnother2() {
        return GIAnother2;
    }

    /**
     * Get GI + total
     *
     * @return Double GI + total
     */
    public double getGITotal() {
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
    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * Set PH of profit
     *
     * @param PH
     */
    public void setPH(double PH) {
        this.PH = PH;
    }

    /**
     * Set GI of profit
     *
     * @param GI
     */
    public void setGI(double GI) {
        this.GI = GI;
    }

    /**
     * Set GI + bonus of profit
     *
     * @param GIBonus
     */
    public void setGIBonus(double GIBonus) {
        this.GIBonus = GIBonus;
    }

    /**
     * Set GI + deposit of profit
     *
     * @param GIDeposit
     */
    public void setGIDeposit(double GIDeposit) {
        this.GIDeposit = GIDeposit;
    }

    /**
     * Set GI + another1 of profit
     *
     * @param GIAnother1
     */
    public void setGIAnother1(double GIAnother1) {
        this.GIAnother1 = GIAnother1;
    }

    /**
     * Set GI + another2 of profit
     *
     * @param GIAnother2
     */
    public void setGIAnother2(double GIAnother2) {
        this.GIAnother2 = GIAnother2;
    }

    /**
     * Set total GI of profit
     *
     * @param GITotal
     */
    public void setGITotal(double GITotal) {
        this.GITotal = GITotal;
    }
}
