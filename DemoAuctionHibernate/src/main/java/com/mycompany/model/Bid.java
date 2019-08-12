package com.mycompany.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name = "bid")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private long amount;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @Enumerated(EnumType.STRING)
    private BidStatus bidStatus;

    public Bid(long amount, Date created) {
        this.amount = amount;
        this.created = created;
    }

    public Bid() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Bid{" + "id=" + id + ", amount=" + amount + ", created=" + created + '}';
    }
    
}
