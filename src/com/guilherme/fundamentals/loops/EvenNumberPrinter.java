package com.guilherme.fundamentals.loops;

public class EvenNumberPrinter {
//    Print all even numbers from 0 to 100
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
