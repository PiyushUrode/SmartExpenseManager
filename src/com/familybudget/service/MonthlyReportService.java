package com.familybudget.service;

import com.familybudget.model.Family;

public class MonthlyReportService implements ReportService {

    private Family family;
    private ExpenseManager expenseManager;
    private BudgetService budgetService;

    public MonthlyReportService(Family family,
                                ExpenseManager expenseManager,
                                BudgetService budgetService) {
        this.family = family;
        this.expenseManager = expenseManager;
        this.budgetService = budgetService;
    }

    @Override
    public void generateReport() {
        System.out.println("\n===== MONTHLY FAMILY REPORT =====");
        family.printFamilySummary();
        expenseManager.printAllExpenses();
        budgetService.printBudgetSummary(family, expenseManager);
        System.out.println("===== REPORT END =====");
    }
}
