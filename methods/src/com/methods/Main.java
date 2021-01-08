package com.methods;

public class Main {

    static String[] months = {"January", "February", "March", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        loopIt();
    }

    static void loopIt() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}
