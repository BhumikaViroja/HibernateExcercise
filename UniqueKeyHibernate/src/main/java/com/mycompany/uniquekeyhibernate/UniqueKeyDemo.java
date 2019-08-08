/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uniquekeyhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author bhumika
 */
public class UniqueKeyDemo {
    public static void main(String[] args) {
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");
        configObj.addAnnotatedClass(UserProfile.class);
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
        System.out.println("session created");
        SessionFactory sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        Session session = sessionFactoryObj.openSession();
        session.beginTransaction();
        UserProfile e1 = new UserProfile("Utsav","utsav@gmail.com",85693214);

        session.save(e1);
        session.getTransaction().commit();
        System.out.println("successfully saved");
        session.close();
        sessionFactoryObj.close();

    }
}
