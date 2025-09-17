package org.example;

public class Laptop implements Computer {
    public Laptop(){
//        System.out.println("Object Created for Laptop Class");
    }

    @Override
    public void laping(){
        System.out.println("Laping method of Laptop class is called...");
    }
}
