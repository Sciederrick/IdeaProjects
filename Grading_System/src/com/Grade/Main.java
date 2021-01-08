package com.Grade;

public class Main {
    public static void main(String [] args){
        Student student = new Student("COM/15/17", "Derrick Mbarani", "Bsc.Computer Science", "Male", 23);
        System.out.println(student.getName());
        System.out.println(student.getAge());

        Student student1 = new Student("Michael Jackson", "Male");
        System.out.println("My name is "+student1.getName()+" and I am a "+student1.getSex());
        student1.setAge(26); //Fn call
    }
}
