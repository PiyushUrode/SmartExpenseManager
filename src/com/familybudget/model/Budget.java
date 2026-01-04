package com.familybudget.model;

public class Budget {

    private double totalIncome;
    private double totalExpense;
    private double savings;

    public Budget(double totalIncome, double totalExpense) {
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.savings = totalIncome - totalExpense;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getSavings() {
        return savings;
    }
}
