package com.familybudget.model;

import java.util.ArrayList;
import java.util.List;

import com.familybudget.enums.RoleType;

public class Person {

    private String name;
    private int age;
    private RoleType role;

    // One person can have multiple income sources
    private List<Income> incomes = new ArrayList<>();

    public Person(String name, int age, RoleType role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Add income
    public void addIncome(Income income) {
        incomes.add(income);
    }

    // Calculate total income
    public double getTotalIncome() {
        double total = 0;
        for (Income income : incomes) {
            total += income.getAmount();
        }
        return total;
    }

    // Summary using StringBuffer
    public String getPersonSummary() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ").append(name)
          .append(", Role: ").append(role)
          .append(", Total Income: ").append(getTotalIncome());
        return sb.toString();
    }

    // Getters
    public String getName() {
        return name;
    }

    public RoleType getRole() {
        return role;
    }
}
