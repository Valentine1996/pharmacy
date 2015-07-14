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
    protected String pharmacy;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "month", length = 16 )
    protected String month;

    @NotNull
    @Range
    @Column( name = "profit")
    protected Double profit;

    @NotNull
    @Range
    @Column( name = "PH")
    protected Double PH;

    @NotNull
    @Range
    @Column( name = "GI")
    protected Double GI;

    @Range
    @Column( name = "GI_bonus")
    protected Double GIBonus;

    @Range
    @Column( name = "GI_deposit")
    protected Double GIDeposit;

    @Range
    @Column( name = "GI_another1")
    protected Double GIAnother1;

    @Range
    @Column( name = "GI_another2")
    protected Double GIAnother2;

    @Range
    @NotNull
    @Column( name = "GI_total")
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

    public Double getGIBonus() {
        return GIBonus;
    }

    public Double getGIDeposit() {
        return GIDeposit;
    }

    public Double getGIAnother1() {
        return GIAnother1;
    }

    public Double getGIAnother2() {
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

    public void setGIBonus(Double GIBonus) {
        this.GIBonus = GIBonus;
    }

    public void setGIDeposit(Double GIDeposit) {
        this.GIDeposit = GIDeposit;
    }

    public void setGIAnother1(Double GIAnother1) {
        this.GIAnother1 = GIAnother1;
    }

    public void setGIAnother2(Double GIAnother2) {
        this.GIAnother2 = GIAnother2;
    }

    public void setGITotal(Double GITotal) {
        this.GITotal = GITotal;
    }
}
