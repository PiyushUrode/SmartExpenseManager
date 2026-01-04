package com.familybudget.model;

import com.familybudget.enums.ExpenseCategory;

public class Expense {

    private ExpenseCategory category;
    private double amount;
    private String description;
    private Person spentBy;

    public Expense(ExpenseCategory category, double amount, String description, Person spentBy) {
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.spentBy = spentBy;
    }

    public double getAmount() {
        return amount;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public Person getSpentBy() {
        return spentBy;
    }

    public String getSummary() {
        return spentBy.getName() + " spent " + amount + " on " + category + " (" + description + ")";
    }
}
