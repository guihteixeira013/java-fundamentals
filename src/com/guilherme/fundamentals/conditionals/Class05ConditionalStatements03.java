package com.guilherme.fundamentals.conditionals;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {

        // if salary > 2000 "buy ps5" "don't buy ps5#

        double salary = 3000D;
        String shouldBuyMessage = "buy ps5";
        String shouldNotBuyMessage = "don't buy ps5";
        // TERNARY OPERATOR >>>    (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
