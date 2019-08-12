package com.mycompany.demoonetoone.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bhumika
 */
public class Main {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Education.class).addAnnotatedClass(Address.class);
        org.hibernate.SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Address add = new Address("GIDC", "Sector_25", "Gandhinagar", "Gandhinagar", "India");
        Education edu = new Education("BE", "BE in Computer", "Atmiya", "2019");
        Student stu = new Student("Bhumika", "R.", "Viroja", "Ms.", "", "bhumika@gmail.com", "9632014587", add, edu);
        session.save(stu);
        tx.commit();

    }

}
