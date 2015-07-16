package com.valentine1996.pharmacy.model.help;

import javax.persistence.Entity;

/**
 * Created by valentyn on 7/15/15.
 */
public class SimpleProfit {
    String shortName;
    double profit;
    double GI;
    double GIBonus;
    double GIDeposit;
    double GIAnother1;
    double GIAnother2;

    public SimpleProfit() {
    }

    public SimpleProfit(String shortName, double profit, double GI, double GIBonus, double GIDeposit, double GIAnother1, double GIAnother2) {
        this.shortName = shortName;
        this.profit = profit;
        this.GI = GI;
        this.GIBonus = GIBonus;
        this.GIDeposit = GIDeposit;
        this.GIAnother1 = GIAnother1;
        this.GIAnother2 = GIAnother2;
    }

    public SimpleProfit(double profit, double GI, double GIBonus, double GIDeposit, double GIAnother1, double GIAnother2) {
        this.profit = profit;
        this.GI = GI;
        this.GIBonus = GIBonus;
        this.GIDeposit = GIDeposit;
        this.GIAnother1 = GIAnother1;
        this.GIAnother2 = GIAnother2;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

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
}
