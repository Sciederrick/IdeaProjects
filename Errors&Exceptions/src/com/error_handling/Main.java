package com.error_handling;

public class Main {

    public static void main(String[] args) {
	    String welcome = "Welcome!";
	    char[] chars = welcome.toCharArray();

        try {
            if (chars.length < 10) {
                throw (new Exception("My custom message"));
            }
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
