package com.prefixAndPostfix;

public class Main {

    public static void main(String[] args) {
	    int intValue = 10;
//	    postfix
        System.out.println("postfix: " + intValue  ++);
//        prefix
        System.out.println("prefix: " + ++ intValue);

        String s = "Hello";
        if(s instanceof java.lang.String){
            System.out.println("s is a String");
        }

        String s1 = "Hello";
        String s2 = "Hello";
        if(s1.equals(s2)){
            System.out.println("They match!");
        }else{
            System.out.println("No match!");
        }


    }
}
