package com.abstract_class;

abstract public class A {
    abstract void callme();
    //  concrete methods are still allowed in abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
