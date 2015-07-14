/// *** *** Model :: Form :: ProfitForm *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-13 10:56:45 :: 2014-07-09 10:59:54
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.view.form;

import com.valentine1996.pharmacy.validation.constraint.CheckPharmacy;
import com.valentine1996.pharmacy.validation.constraint.CheckYear;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ProfitForm {
    /// *** Properties  *** ///
    protected Long id;

    @NotNull
    @Min(2010)
    @CheckYear
    protected Integer year;

    @NotNull
    @NotEmpty
    @Length(max = 32)
    @CheckPharmacy
    protected String pharmacy;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    protected String month;

    @NotNull
    @Range
    protected Double profit;

    @NotNull
    @Range
    protected Double PH;

    @NotNull
    @Range
    protected Double GI;

    @Range
    protected double GIBonus;

    @Range
    protected double GIDeposit;

    @Range
    protected double GIAnother1;

    @Range
    protected double GIAnother2;

    @Range
    @NotNull
    protected Double GITotal;
    
    //-SECTION - GETTERS-//

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public String getMonth() {
        return month;
    }

    public Double getProfit() {
        return profit;
    }

    public Double getPH() {
        return PH;
    }

    public Double getGI() {
        return GI;
    }

    public double getGIBonus() {
        return GIBonus;
    }

    public double getGIDeposit() {
        return GIDeposit;
    }

    public double getGIAnother1() {
        return GIAnother1;
    }

    public double getGIAnother2() {
        return GIAnother2;
    }

    public Double getGITotal() {
        return GITotal;
    }


    //-SECTION - Setters-//

    public void setId(Long id) {
        this.id = id;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public void setPH(Double PH) {
        this.PH = PH;
    }

    public void setGI(Double GI) {
        this.GI = GI;
    }

    public void setGIBonus(double GIBonus) {
        this.GIBonus = GIBonus;
    }

    public void setGIDeposit(double GIDeposit) {
        this.GIDeposit = GIDeposit;
    }

    public void setGIAnother1(double GIAnother1) {
        this.GIAnother1 = GIAnother1;
    }

    public void setGIAnother2(double GIAnother2) {
        this.GIAnother2 = GIAnother2;
    }

    public void setGITotal(Double GITotal) {
        this.GITotal = GITotal;
    }
}
