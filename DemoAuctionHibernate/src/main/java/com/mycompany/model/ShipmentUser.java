package com.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name="shipmentuser")
public class ShipmentUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Enumerated(EnumType.STRING)
    private ShipmentFor shipmentFor;

    public ShipmentUser(ShipmentFor shipmentFor) {
        this.shipmentFor = shipmentFor;
    }

    public ShipmentUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShipmentFor getShipmentFor() {
        return shipmentFor;
    }

    public void setShipmentFor(ShipmentFor shipmentFor) {
        this.shipmentFor = shipmentFor;
    }

    @Override
    public String toString() {
        return "ShipmentUser{" + "id=" + id + ", shipmentFor=" + shipmentFor + '}';
    }
    
    
}
