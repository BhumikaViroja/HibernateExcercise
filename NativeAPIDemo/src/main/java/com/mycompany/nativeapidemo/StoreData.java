package com.mycompany.nativeapidemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bhumika
 */
public class StoreData {

    public static void main(String[] args) {
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");
        configObj.addAnnotatedClass(HelloWorld.class);
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
        System.out.println("session created");
        SessionFactory sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        Session session = sessionFactoryObj.openSession();
        session.beginTransaction();
        HelloWorld e1 = new HelloWorld("Hello world1");

        session.save(e1);
        session.getTransaction().commit();
        System.out.println("successfully saved");
        session.close();
        sessionFactoryObj.close();

    }
}
