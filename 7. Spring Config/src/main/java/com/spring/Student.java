package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("21")
    private int rNo;
    private String name;
    private int marks;
    @Autowired
    @Qualifier("topperStudent")
    private School School;

    public Student(){

        System.out.println("This is Default Constructor of Student");
    }

    // Parametrized Constructor(for constructor Injection)
    public Student(int rNo, String name, int marks, School School) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
        this.School = School;
    }

    //Getters and Setters for
    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public School getSchool() {
        return School;
    }

    public void setSchool(School school) {
        this.School = School;
    }

    public void printStudent(){
        System.out.println("Hello Students");
    }
}
