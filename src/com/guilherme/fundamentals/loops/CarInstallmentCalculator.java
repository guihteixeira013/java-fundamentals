package com.guilherme.fundamentals.loops;

public class CarInstallmentCalculator {
    /*
        For example, Car's price: 20000$
        To find HOW MUCH and for HOW LONG I'll have to pay MONTHLY.
        condition>    The monthly payment cannot be lower than 1000
    */
    public static void main(String[] args) {
        double totalPrice = 20000;

        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthyPrice = totalPrice / monthCount;

            if(monthyPrice < 1000) {
                break;
            }

            System.out.println("Months: " + monthCount + "   Price: " + monthyPrice);
        }

    }
}
