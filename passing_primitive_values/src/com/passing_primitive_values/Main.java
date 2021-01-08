package com.passing_primitive_values;

public class Main {
    // Demonstrating that java parses value to functions by value (copies)
    public static void main(String[] args) {
        //  The aforementioned only works for Primitive data types
        int original = 10;
        System.out.println("Original before: " + original);
        incrementValue(original);
        System.out.println("Original after: " + original);

        //  Complex data types such as Arrays, Objects are parsed by reference
        int[] arOriginal = {10, 20, 30};
        System.out.println("\nOriginal before (array): " + arOriginal[0]);
        incrementValue(arOriginal);
        System.out.println("Original after (array): " + arOriginal[0]);

        //  String is a complex data type but an exception to this rule
        //  String values are immutable, they don't change, a copy of the entire String is created when passed to a method
        String strOriginal = "Original!";
        System.out.println("\nOriginal before: " + strOriginal);
        changeString(strOriginal);
        System.out.println("Original after: " + strOriginal);
    }

    static void incrementValue(int inMethod) {
        inMethod++;
        System.out.println("In method: " + inMethod);
    }

    static void incrementValue(int[] inMethod) {
        inMethod[0] ++;
        System.out.println("In method: " + inMethod[0]);
    }

    static void changeString(String inMethod) {
        inMethod = "New!";
        System.out.println("In method: " + inMethod);
    }
}
