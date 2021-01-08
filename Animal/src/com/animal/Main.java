package com.animal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Human human = new Human();
        human.eat();
        Man man = new Man();
        man.eat();
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}
