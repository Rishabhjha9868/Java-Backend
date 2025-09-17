package com.spring;

import org.springframework.stereotype.Component;

@Component
public class TopperStudent implements School{
    public TopperStudent(){
        System.out.println("TopperStudent is Compiling...");
    }

    @Override
    public void printNewStudent(){
        System.out.println("This is TopperStudent");
    }
}
