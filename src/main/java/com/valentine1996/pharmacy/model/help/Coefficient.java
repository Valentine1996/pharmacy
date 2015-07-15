/// *** *** Model :: Help :: Coefficient *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-14 14:08:56 :: 2014-07-14 09:04:45
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
package com.valentine1996.pharmacy.model.help;

import com.valentine1996.pharmacy.model.entity.Pharmacy;

/**
 * Class for representation pharmacy with coefficient
 */
public class Coefficient {

    //- PROPERTIES-//
    private Pharmacy pharmacy;

    private double profit;

    private double PH;

    private double GI;

    private double GIBonus;

    private double GIDeposit;

    private double GIAnother1;

    private double GIAnother2;

    private double rateAll;

    private double rateFOP;

    private double ratePP;

    private double rateTOV;

    private double averageAll;

    private double averageFOP;

    private double averagePP;

    private double averageTOV;

    //-METHODS-//
    //-SECTION - GETTERS-//

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public double getProfit() {
        return profit;
    }

    public double getPH() {
        return PH;
    }

    public double getGI() {
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

    public double getRateAll() {
        return rateAll;
    }

    public double getRateFOP() {
        return rateFOP;
    }

    public double getRatePP() {
        return ratePP;
    }

    public double getRateTOV() {
        return rateTOV;
    }

    public double getAverageAll() {
        return averageAll;
    }

    public double getAverageFOP() {
        return averageFOP;
    }

    public double getAveragePP() {
        return averagePP;
    }

    public double getAverageTOV() {
        return averageTOV;
    }

    //-SECTION - SETTERS-//

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    public void setGI(double GI) {
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

    public void setRateAll(double rateAll) {
        this.rateAll = rateAll;
    }

    public void setRateFOP(double rateFOP) {
        this.rateFOP = rateFOP;
    }

    public void setRatePP(double ratePP) {
        this.ratePP = ratePP;
    }

    public void setRateTOV(double rateTOV) {
        this.rateTOV = rateTOV;
    }

    public void setAverageAll(double averageAll) {
        this.averageAll = averageAll;
    }

    public void setAverageFOP(double averageFOP) {
        this.averageFOP = averageFOP;
    }

    public void setAveragePP(double averagePP) {
        this.averagePP = averagePP;
    }

    public void setAverageTOV(double averageTOV) {
        this.averageTOV = averageTOV;
    }
}
