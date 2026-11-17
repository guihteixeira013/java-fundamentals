package com.guilherme.fundamentals.syntax;

public class PrimitiveTypesDemo {
    public  static void main (String[] args) {
        // declaring variables
        int age = 31;
        byte ageByte = 127;
        float salaryFloat = 100.00F;
        char character = 11;
        String name = "Guilherme Teixeira";

        /**
        ShortCuts tips:
            Duplicating line:
                CTRL + D
            public static void main(String[] args) line:
                write "psvm"
            System.out.println() line:
                write "sout"
        */
        //OUTPUT
        System.out.println("Hi, I'm " +name+ " and I've " +age+ " years old.");
    }
}