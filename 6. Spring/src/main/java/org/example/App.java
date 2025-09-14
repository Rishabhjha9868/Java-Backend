package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.getAge());
        obj1.print();

        Desktop obj2 = context.getBean("computer2", Desktop.class);
        obj2.laping();


//        scope
//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.age = 17;
//        System.out.println(obj1.age + obj2.age);


    }
}
