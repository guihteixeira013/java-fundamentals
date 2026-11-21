package com.guilherme.fundamentals.arrays;

public class AgeArrayTraversal {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 5;
        ages[1] = 50;
        ages[2] = 500;

        for (int i = 0; i < ages.length; i++) {
            System.out.println("in " + ages[i]);
        }
        System.out.println("out");
    }
}
