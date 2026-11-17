package com.guilherme.fundamentals.syntax;

public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("Lets to learn about Java operators!");

        /* Relational operators < > <= >= != ==
                remember: The types must match (like int with int, char with char)

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 10;
        boolean isWordEquals = "dez" == "dez";
        //OUTPUT
        System.out.println("isTenGreaterThanTwenty = " + isTenGreaterThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty = " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenLowerThanTwenty = " + isTenLowerThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty = " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty = " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty = " + isTenEqualsTwenty);
        System.out.println("isWordEquals = " + isWordEquals);


        //LOGICAL OPERATORS || && (AND) || OR ||
          >>>  EXEMPLES OF "AND (&&)"

        int age = 31;
        float salary = 1100F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612.00F;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381.00F;

        System.out.println("My age: " + age);
        System.out.println("My salary: " + salary);
        System.out.println("isLegalOlderThanThirty  " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty  " + isLegalYoungerThanThirty);

           >>> EXEMPLES OF "OR" (||)

        // To buy a PS5, PS5 price is 500 euros.
        double currentMoney = 3000D;
        double currentSavings = 499D;
        float ps5Price = 500;
        boolean canBeBought = currentMoney >= ps5Price || currentSavings >= ps5Price;

        System.out.println("[Current Money: " + currentMoney + "$]");
        System.out.println("[Current Savings: " + currentSavings + "$]");
        System.out.println("PS5 price: " + ps5Price + "$");
        System.out.println("canBeBought: " + canBeBought);
        */

        // Assignment
        double bonus = 1000;
        bonus += 1000;      //bonus = bonus + 1000
        bonus -= 1000;      //bonus = bonus - 1000
        bonus *= 2;      //bonus = bonus * 2

        System.out.println(bonus);

        // Unary ++ --
        ++bonus;    //+1
        ++bonus;    //+1
        --bonus;    //-1
        --bonus;    //-1
        --bonus;    //-1
        ++bonus;    //+1
        System.out.println(bonus);
    }
}
