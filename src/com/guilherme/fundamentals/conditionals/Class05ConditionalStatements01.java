package com.guilherme.fundamentals.conditionals;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        // INPUT
        int age = 8;
        boolean isAllowedToEnterInTheParty = age >= 18;

        // PROCESSING
        if(age >= 18) {
            System.out.println("ALLOWED");
        }
        if(!isAllowedToEnterInTheParty) {
            System.out.println("Sorry, You are not allowed to enter in the party");
        }

        System.out.println("out if");
    }
}
