package com.guilherme.fundamentals.loops;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
            if (i == 25) {
                System.out.println("FOUNDED! " + i);
                break;
            }
            System.out.println(i);
        }
        System.out.println("outside for");
    }
}
