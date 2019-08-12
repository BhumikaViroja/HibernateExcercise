package com.mycompany.model;

//import java.sql.Date;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bhumika
 */
public class DemoAuctionHibernate {

    public static void main(String[] args) {
        System.out.println("Hello world");
        SessionFactory sessionFactory;
        Session session;

        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        
        User user=new User("Bhumika", "R", "Viroja", "bviroja" , "asdf", "fhf@gmail.com", 4, true);
        BillingDetails billingDetails=new BillingDetails("infocity");
      
        Date date=new Date();
        Category category=new Category("grocery",   date);
        Shipment shipment = new Shipment(67,"",date);
        session.save(billingDetails);
        session.save(category);
        session.save(shipment);
        session.save(user);
        session.close();

    }
}
