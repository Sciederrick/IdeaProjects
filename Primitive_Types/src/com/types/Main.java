package com.types;

public class Main {

    public static void main(String[] args) {
    // write your code here
        double doubleValue = 156.5d;
        System.out.println("doubleValue: "+doubleValue);
        Double doubleObj = new Double(doubleValue);
        System.out.println("doubleObj: "+doubleObj);
        byte byteValue = doubleObj.byteValue();
        System.out.println("byteValue: "+byteValue);
        int intValue = doubleObj.intValue();
        System.out.println("intValue: "+intValue);
        float floatValue = doubleObj.floatValue();
        System.out.println("floatValue: "+floatValue);
        String stringValue = doubleObj.toString();
        System.out.println("stringValue: "+stringValue);

        short sh = 1;
        int i = 1;
        long l = 1L;
        float f = 1f;
        double d = 1d;

        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        byte b = 127;
        System.out.println("Byte: "+b);

        if(b < Byte.MAX_VALUE){
            b++;
        }

        System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
        System.out.println("Byte: "+b);
    }
}
