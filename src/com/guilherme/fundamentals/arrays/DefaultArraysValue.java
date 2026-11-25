package com.guilherme.fundamentals.arrays;

public class DefaultArraysValue {
    public static void main(String[] args) {
//        DEFAULT VALUES
//        byte, short, double, float, long, int = 0
//        char = '\u0000' OR ''
//        boolean = false
//        String = null

        int[] ages = new int[3];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 3;

        System.out.println("ages[0] = " + ages[0]);
        System.out.println("ages[1] = " + ages[1]);
        System.out.println("ages[2] = " + ages[2]);
    }
}
