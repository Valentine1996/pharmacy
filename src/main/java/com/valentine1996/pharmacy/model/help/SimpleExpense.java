package com.valentine1996.pharmacy.model.help;

/**
 * Class for getting sums of expense from table expense
 */
public class SimpleExpense {

    public  String clause;

    double sum;

    public SimpleExpense() {
    }

    public SimpleExpense(String clause, double sum) {
        this.clause = clause;
        this.sum = sum;
    }

    //-SECTION : GETTERS AND SETTERS-//

    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
