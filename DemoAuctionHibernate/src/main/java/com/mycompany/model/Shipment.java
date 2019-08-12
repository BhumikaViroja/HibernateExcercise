package com.mycompany.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name = "shipment")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inspection_period_days")
    private int inspectionPeriodDays;

    @Column(name = "state")
    private String state;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "shipment_id")
    private List<ShipmentUser> shipmentUsers;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_address")
    private Address address;

    public Shipment() {
    }

    public Shipment(int inspectionPeriodDays, String state, Date created) {
        this.inspectionPeriodDays = inspectionPeriodDays;
        this.state = state;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInspectionPeriodDays() {
        return inspectionPeriodDays;
    }

    public void setInspectionPeriodDays(int inspectionPeriodDays) {
        this.inspectionPeriodDays = inspectionPeriodDays;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Shipment{" + "id=" + id + ", inspectionPeriodDays=" + inspectionPeriodDays + ", state=" + state + ", created=" + created + '}';
    }

    
}
