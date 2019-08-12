package com.mycompany.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "category_id")
    private Set<Item> item;
    
   @OneToOne
   @JoinColumn(name="parent_id")
   private Category parent;

   @OneToMany(mappedBy="parent", cascade = CascadeType.ALL)
   private Set<Category> children;

    public Category(String firstName, Date created) {
        this.name = firstName;
        this.created = created;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", firstName=" + name + ", created=" + created + '}';
    }
    
    
}
