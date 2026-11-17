package com.guilherme.fundamentals.loops;

public class LoopControlDemo {
    public static void main(String[] args) {
        // while,  do-while,  for
        byte c = 0;
//  WHILE
//        while (c < 10) {
//            System.out.println("Counter: " + ++c);
//        }

//  DO WHILE
//        do {
//            System.out.println("Counter: " + ++c);
//        } while (c < 10);

//  FOR
        for (int i = 0; i < 10; i++) {
            System.out.println("inside FOR " + i);
        }
    }
}
