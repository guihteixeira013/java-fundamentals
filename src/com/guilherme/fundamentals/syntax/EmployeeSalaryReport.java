package com.guilherme.fundamentals.syntax;

public class EmployeeSalaryReport {
    public static void main(String[] args) {
        //VARIABLES
        String name = "Guilherme Teixeira";
        String address = "03 Joaquim Martins Neves";
        double salary = 1100.00D;
        //date variables - DD/MM/YYYY
        int day = 10;
        int month = 7;
        int year = 2002;

        String receivedSalaryDate = day + "/" + month + "/" + year;
        String report = "I " + name + ", living at " + address + " confirm that I received the salary of " + salary + " euros on date " + receivedSalaryDate;

        // OUTPUT
        System.out.println(report);

    }
}
