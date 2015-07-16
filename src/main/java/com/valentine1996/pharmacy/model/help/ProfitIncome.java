/// *** *** Model :: Help :: ProfitIncome *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-14 16:24:15 :: 2014-07-14
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
package com.valentine1996.pharmacy.model.help;

import com.valentine1996.pharmacy.model.entity.Pharmacy;

/**
 * Class for representation table with profit and income
 */
public class ProfitIncome {
    //- Properties -//

    //- Profit properties -//
    double profit;

    double GI;

    double GIBonus;

    double GIDeposit;

    double GIAnother1;

    double GIAnother2;

    //- Expense properties -//

    double sumZP;

    double sumOR;

    double sumRP;

    double sumPOD;

    double sumOZ;

    double sumAnother;

    public ProfitIncome() {
    }

    public ProfitIncome(double profit, 
                        double GI, 
                        double GIBonus, 
                        double GIDeposit, 
                        double GIAnother1, 
                        double GIAnother2, 
                        double sumZP, 
                        double sumOR, 
                        double sumRP, 
                        double sumPOD, 
                        double sumOZ, 
                        double sumAnother) {
        this.profit = profit;
        this.GI = GI;
        this.GIBonus = GIBonus;
        this.GIDeposit = GIDeposit;
        this.GIAnother1 = GIAnother1;
        this.GIAnother2 = GIAnother2;
        this.sumZP = sumZP;
        this.sumOR = sumOR;
        this.sumRP = sumRP;
        this.sumPOD = sumPOD;
        this.sumOZ = sumOZ;
        this.sumAnother = sumAnother;
    }

    //-Section GETTERS and SETTERS-//

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getGI() {
        return GI;
    }

    public void setGI(double GI) {
        this.GI = GI;
    }

    public double getGIBonus() {
        return GIBonus;
    }

    public void setGIBonus(double GIBonus) {
        this.GIBonus = GIBonus;
    }

    public double getGIDeposit() {
        return GIDeposit;
    }

    public void setGIDeposit(double GIDeposit) {
        this.GIDeposit = GIDeposit;
    }

    public double getGIAnother1() {
        return GIAnother1;
    }

    public void setGIAnother1(double GIAnother1) {
        this.GIAnother1 = GIAnother1;
    }

    public double getGIAnother2() {
        return GIAnother2;
    }

    public void setGIAnother2(double GIAnother2) {
        this.GIAnother2 = GIAnother2;
    }

    public double getSumZP() {
        return sumZP;
    }

    public void setSumZP(double sumZP) {
        this.sumZP = sumZP;
    }

    public double getSumOR() {
        return sumOR;
    }

    public void setSumOR(double sumOR) {
        this.sumOR = sumOR;
    }

    public double getSumRP() {
        return sumRP;
    }

    public void setSumRP(double sumRP) {
        this.sumRP = sumRP;
    }

    public double getSumPOD() {
        return sumPOD;
    }

    public void setSumPOD(double sumPOD) {
        this.sumPOD = sumPOD;
    }

    public double getSumOZ() {
        return sumOZ;
    }

    public void setSumOZ(double sumOZ) {
        this.sumOZ = sumOZ;
    }

    public double getSumAnother() {
        return sumAnother;
    }

    public void setSumAnother(double sumAnother) {
        this.sumAnother = sumAnother;
    }
}
