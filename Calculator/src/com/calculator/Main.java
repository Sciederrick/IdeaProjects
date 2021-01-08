package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String firstValue = sc.nextLine();
        System.out.print("\nEnter a second value: ");
        String secondValue = sc.nextLine();

        double firstValueInteger = Double.parseDouble(firstValue);
        double secondValueInteger = Double.parseDouble(secondValue);
        double result = firstValueInteger + secondValueInteger;
        String output = Double.toString(result);
        System.out.println("Sum: " + output);
    }

}
