package com.familybudget.model;

import com.familybudget.enums.IncomeType;

public class Income {

    private IncomeType incomeType;
    private double amount;

    public Income(IncomeType incomeType, double amount) {
        this.incomeType = incomeType;
        this.amount = amount;
    }

    public IncomeType getIncomeType() {
        return incomeType;
    }

    public double getAmount() {
        return amount;
    }
}
