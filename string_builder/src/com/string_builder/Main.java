package com.string_builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);
        
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}
