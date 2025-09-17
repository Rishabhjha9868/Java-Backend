package com.spring;

import com.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TopperStudent ts = context.getBean(TopperStudent.class);
        ts.printNewStudent();

        TopperStudent ts1 = context.getBean(TopperStudent.class);
        ts.printNewStudent();

        Student st = context.getBean(Student.class);
        st.printStudent();
        System.out.println(st.getrNo());
        System.out.println(st.getSchool());















//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Student obj1 = (Student) context.getBean("student");
//        obj1.printStudent();
//        System.out.println("Name of the Student is "+ obj1.getName()+" rollNo. is "+obj1.getrNo()+" and The marks is "+obj1.getMarks());
     }
    }
