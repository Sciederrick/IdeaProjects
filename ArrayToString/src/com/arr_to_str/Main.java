package com.arr_to_str;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	    char[] chars = {'H','e','l','l','o','!'};
	    String s = new String(chars);
        System.out.println(s);

        char[] char2 = s.toCharArray();
        for (char c : char2){
            System.out.println(c);
        }

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
    }
}
