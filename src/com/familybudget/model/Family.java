package com.familybudget.model;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    public double getTotalFamilyIncome() {
        double total = 0;
        for (Person person : members) {
            total += person.getTotalIncome();
        }
        return total;
    }

    public void printFamilySummary() {
        System.out.println("---- Family Summary ----");
        for (Person p : members) {
            System.out.println(p.getPersonSummary());
        }
        System.out.println("Total Family Income: " + getTotalFamilyIncome());
    }
}
