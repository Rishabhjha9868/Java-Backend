package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer computer;


//    parametrized Constructor
//    @ConstructorProperties({"lap","age"})
//    public Alien(Laptop lap, int age) {
//        this.computer = lap;
//        this.age = age;
//    }

//   getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    //    default constructor
    public Alien(){
    }


//    method/function
    public void print(){
        computer.laping();
    }
}
