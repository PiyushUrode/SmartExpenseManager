package com.familybudget.app;

import com.familybudget.enums.ExpenseCategory;
import com.familybudget.enums.IncomeType;
import com.familybudget.enums.RoleType;

import com.familybudget.model.Expense;
import com.familybudget.model.Family;
import com.familybudget.model.Income;
import com.familybudget.model.Person;

import com.familybudget.service.BudgetService;
import com.familybudget.service.CategoryReportService;
import com.familybudget.service.ExpenseManager;
import com.familybudget.service.MonthlyReportService;
import com.familybudget.service.ReportService;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("===== SMART EXPENSE MANAGER STARTED =====\n");

        // ================= FAMILY & INCOME =================
        Person father = new Person("Raj", 40, RoleType.FATHER);
        father.addIncome(new Income(IncomeType.JOB, 50000.0));
        father.addIncome(new Income(IncomeType.RENT, 10000.0));

        Person mother = new Person("Sita", 38, RoleType.MOTHER);
        mother.addIncome(new Income(IncomeType.FREELANCE, 15000.0));

        Family family = new Family();
        family.addMember(father);
        family.addMember(mother);

        // ================= EXPENSE MANAGEMENT ==========
        ExpenseManager expenseManager = new ExpenseManager();

        expenseManager.addExpense(
                new Expense(ExpenseCategory.FOOD, 8000.0, "Monthly grocery", mother));

        expenseManager.addExpense(
                new Expense(ExpenseCategory.RENT, 15000.0, "House rent", father));

        expenseManager.addExpense(
                new Expense(ExpenseCategory.EDUCATION, 5000.0, "Child school fees", father));

        expenseManager.addExpense(
                new Expense(ExpenseCategory.TRANSPORT, 3000.0, "Fuel & travel", father));

        // ================= MONTHLY REPORT =================
        BudgetService budgetService = new BudgetService();
        ReportService monthlyReport =
                new MonthlyReportService(family, expenseManager, budgetService);

        monthlyReport.generateReport();

        // ================= CATEGORY-WISE REPORT =================
        CategoryReportService categoryReport =
                new CategoryReportService(expenseManager);

        categoryReport.generateCategoryReport();

        System.out.println("\n===== SMART EXPENSE MANAGER ENDED =====");
    }
}
