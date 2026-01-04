package com.familybudget.service;

import com.familybudget.model.Family;

public class IncomeService {

    public double calculateTotalIncome(Family family) {
        return family.getTotalFamilyIncome();
    }
}
