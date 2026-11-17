package com.guilherme.fundamentals.conditionals;

public class Class05Challenge2 {
    public static void main(String[] args) {
        /** How muck taxes that I will pay based on my anual salary?

         TAXABLE INCOME			TAX PER BRACKET
         From		up to and including
         0$			34.712$			    9.70%
         34.713$    68.507$			    37.35%
         68.508$						49.50%

         */
//        INPUT
        double annualSalary = 70000;
        // Taxes
        double lowTax = 9.70D / 100;
        double midTax = 37.35D / 100;
        double highTax = 49.50D / 100;

        // Conditions
        boolean isTaxedByLowTax = annualSalary <= 34712 ? true : false;
        boolean isTaxedByMediumTax = annualSalary >= 34713 && annualSalary <= 68507 ? true : false;

        // Amount to pay
        double amountToPay;

        System.out.println("[ Annual salary: " + annualSalary + "$ ]");

        if (isTaxedByLowTax) {
            amountToPay = lowTax * annualSalary;
        } else if (isTaxedByMediumTax) {
            amountToPay = midTax * annualSalary;
        } else {
            amountToPay = highTax * annualSalary;
        }
//        OUTPUT
        System.out.println("Amount to pay: " + amountToPay + "$");
    }
}
