package com.familybudget.utils;

public class ValidationUtil {

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
