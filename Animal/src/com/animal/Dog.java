package com.animal;

public class Dog {
    String name;
    String color;
    int age;

    //Constructors: have no return type not even void
    //Has exactly the same name as the class name
    //Must have a public access
    public Dog(String dogName, String color, int age){ //Constructor
        this.name = dogName;
        this.color = color;
        this.age = age;
    }

    //Getter and Setter
    public void setName(String name){ //Setter
        this.name = name;
    }

    public String getColor(){ //Getter
        return color;
    }
}
