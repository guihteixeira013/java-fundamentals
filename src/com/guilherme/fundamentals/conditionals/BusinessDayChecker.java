package com.guilherme.fundamentals.conditionals;

public class BusinessDayChecker {
    //    Using switch, print if the day  is business day or weekend
//    Giving the numbers 1 to 7, 1 being Sunday
    public static void main(String[] args) {
        byte day = 11;

        switch (day) {
            case 1:
            case 7:
                System.out.println(day + " Weekend Day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(day + " Business Day");
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
