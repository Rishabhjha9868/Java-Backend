package org.Rishabh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(109);
        s1.setStudentName("Ayush");
        s1.setStudentAge(27);

        Configuration config = new Configuration();     //create object of config
        config.addAnnotatedClass(org.Rishabh.Student.class);  //addAnnotated class under org.Rishabh
        config.configure();                             //load the xml
        SessionFactory sf = config.buildSessionFactory();   //building sessionfactory
        Session session =sf.openSession();              //open Session
        session.persist(s1);

        Transaction transaction = session.beginTransaction();  //for every save we need to commit first
        transaction.commit();

        System.out.println(s1);
    }
}