package com.guilherme.fundamentals.arrays;

public class IterateNames {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Pamela";
        names[1] = "Angela";
        names[2] = "Lucia";

        for (int i = 0; i < names.length; i++) {
            System.out.println("name: " + names[i]);
        }
    }
}
