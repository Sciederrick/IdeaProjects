package com.factorial;

public class Factorial {
    //  This is a recursive method
    static int fact(int n){
        int result;
        if(n==1)
            return 1;
        result = fact(n-1) * n;
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(fact(3));
    }
}
