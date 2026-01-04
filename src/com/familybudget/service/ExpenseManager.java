//package com.familybudget.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.familybudget.model.Expense;
//
//public class ExpenseManager {
//
//    private List<Expense> expenses = new ArrayList<>();
//
//    public void addExpense(Expense expense) {
//        expenses.add(expense);
//    }
//
//    public double getTotalExpense() {
//        double total = 0;
//        for (Expense e : expenses) {
//            total += e.getAmount();
//        }
//        return total;
//    }
//
//    public void printAllExpenses() {
//        System.out.println("---- Expense Details ----");
//        for (Expense e : expenses) {
//            System.out.println(e.getSummary());
//        }
//        System.out.println("Total Expense: " + getTotalExpense());
//    }
//}



//package com.familybudget.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.familybudget.model.Expense;
//import com.familybudget.utils.ValidationUtil;
//
//public class ExpenseManager {
//
//    private List<Expense> expenses = new ArrayList<>();
//
//    public void addExpense(Expense expense) {
//        ValidationUtil.validateAmount(expense.getAmount());
//        expenses.add(expense);
//    }
//
//    public double getTotalExpense() {
//        double total = 0;
//        for (Expense e : expenses) {
//            total += e.getAmount();
//        }
//        return total;
//    }
//
//    public void printAllExpenses() {
//        System.out.println("---- Expense Details ----");
//        for (Expense e : expenses) {
//            System.out.println(e.getSummary());
//        }
//        System.out.println("Total Expense: " + getTotalExpense());
//    }
//}



package com.familybudget.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.familybudget.enums.ExpenseCategory;
import com.familybudget.model.Expense;
import com.familybudget.utils.ValidationUtil;

public class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        ValidationUtil.validateAmount(expense.getAmount());
        expenses.add(expense);
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    // 🔥 NEW: Category-wise expense
    public Map<ExpenseCategory, Double> getCategoryWiseExpense() {
        Map<ExpenseCategory, Double> categoryMap = new HashMap<>();

        for (Expense e : expenses) {
            ExpenseCategory category = e.getCategory();
            double amount = e.getAmount();

            categoryMap.put(
                category,
                categoryMap.getOrDefault(category, 0.0) + amount
            );
        }
        return categoryMap;
    }

    public void printAllExpenses() {
        System.out.println("---- Expense Details ----");
        for (Expense e : expenses) {
            System.out.println(e.getSummary());
        }
        System.out.println("Total Expense: " + getTotalExpense());
    }
}

