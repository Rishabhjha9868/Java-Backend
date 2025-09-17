package com.spring;


import org.springframework.stereotype.Component;

@Component
public class NewStudent implements School {
   public NewStudent(){
        System.out.println("This is Default Constructor of NewStudent");
    }

    @Override
    public void printNewStudent(){

       System.out.println("This is newStudent");
    }
}
