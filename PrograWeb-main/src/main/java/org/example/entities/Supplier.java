package org.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="suppliers")
public class Supplier implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, length = 50)
    private String name;

    @Column(name="address", nullable = false, length = 50)
    private String address;

    @Column(name= "categ", nullable = false, length = 50)
    private String categ;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public Supplier setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
    	return name;
    }

    public Supplier setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Supplier setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCateg() {
        return categ;
    }

    public Supplier setCateg(String categ) {
        this.categ = categ;
        return this;
    }

    }
