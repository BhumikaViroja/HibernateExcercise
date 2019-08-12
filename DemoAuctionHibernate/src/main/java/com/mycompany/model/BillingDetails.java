package com.mycompany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author bhumika
 */


@Entity
@Table(name = "billingdetails")
@Inheritance(
    strategy = InheritanceType.JOINED
)
public class BillingDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "street")
    private String street;

    public BillingDetails(String street) {
        this.street = street;
    }

    public BillingDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "BillingDetails{" + "id=" + id + ", street=" + street + '}';
    }
    
}
