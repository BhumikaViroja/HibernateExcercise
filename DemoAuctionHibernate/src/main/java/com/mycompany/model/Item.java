package com.mycompany.model;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20)
    private String firstName;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "initial_price")
    private long initialPrice;

    @Column(name = "reserve_price")
    private long reservePrice;

    @Column(name = "startdate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;

    @Column(name = "enddate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;

    @Column(name = "state")
    private String state;
    
    @Column(name = "approval_date_time")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date approvalDateTime;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "item_id")
    private List<Comment> comments;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "item_id")
    private Set<Bid> bids;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<User> soldTo;

    public Item(String firstName, String description, long initialPrice, long reservePrice, Date startDate, Date endDate, String state, Date approvalDateTime) {
        this.firstName = firstName;
        this.description = description;
        this.initialPrice = initialPrice;
        this.reservePrice = reservePrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
        this.approvalDateTime = approvalDateTime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(long initialPrice) {
        this.initialPrice = initialPrice;
    }

    public long getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(long reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getApprovalDateTime() {
        return approvalDateTime;
    }

    public void setApprovalDateTime(Date approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", firstName=" + firstName + ", description=" + description + ", initialPrice=" + initialPrice + ", reservePrice=" + reservePrice + ", startDate=" + startDate + ", endDate=" + endDate + ", state=" + state + ", approvalDateTime=" + approvalDateTime + '}';
    }

    
}
