package com.Grade;

public class Student {
    String regNo;
    String name;
    String degreeProgram;
    String sex;
    int age;

    public Student(String regNo, String name, String degreeProgram, String sex, int age){
        this.regNo = regNo;
        this.name = name;
        this.degreeProgram = degreeProgram;
        this.sex = sex;
        this.age = age;
    }

    public Student(String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
