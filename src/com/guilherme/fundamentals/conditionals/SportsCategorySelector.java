package com.guilherme.fundamentals.conditionals;

public class SportsCategorySelector {//it's a CLASS
    public static void main(String[] args) {    //it's a METHOD
        // age < 15                 category junior
        // age >= 15 && age < 18    category senior
        // age >= 18                category masters

        int age = 160;
        // TERNARY OPERATOR
        // IF with 3 conditions
        //          IF CONDITION            TRUE           IF CONDITION             TRUE            FALSE
        String category = age < 15 ? "category junior" : age >=15 && age < 18 ? "category senior" : "category masters";

        System.out.println(">>> age: " + age);
/**
        if (age < 15) {
            category = "Category Junior";
        } else if (age >= 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category Masters";
        }
*/

        System.out.println(category);
    }
}
