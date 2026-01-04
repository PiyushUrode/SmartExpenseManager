package com.familybudget.service;

import java.util.Map;

import com.familybudget.enums.ExpenseCategory;

public class CategoryReportService {

    private ExpenseManager expenseManager;

    public CategoryReportService(ExpenseManager expenseManager) {
        this.expenseManager = expenseManager;
    }

    public void generateCategoryReport() {
        System.out.println("\n---- CATEGORY WISE EXPENSE REPORT ----");

        Map<ExpenseCategory, Double> report =
                expenseManager.getCategoryWiseExpense();

        for (Map.Entry<ExpenseCategory, Double> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
