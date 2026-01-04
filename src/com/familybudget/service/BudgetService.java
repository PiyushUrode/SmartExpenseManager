package com.familybudget.service;

import com.familybudget.model.Family;

public class BudgetService {

    public double calculateSavings(Family family, ExpenseManager expenseManager) {
        return family.getTotalFamilyIncome() - expenseManager.getTotalExpense();
    }

    public void printBudgetSummary(Family family, ExpenseManager expenseManager) {
        System.out.println("---- Budget Summary ----");
        System.out.println("Total Income : " + family.getTotalFamilyIncome());
        System.out.println("Total Expense: " + expenseManager.getTotalExpense());
        System.out.println("Savings      : " + calculateSavings(family, expenseManager));
    }
}
