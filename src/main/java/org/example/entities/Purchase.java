package org.example.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="purchases")
public class Purchase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pu_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar date;

    @Column(name="pu_amount", nullable = false)
    private Long amount;

    @Column(name="pu_address", nullable = false, length = 50)
    private String address;

    @Column(name= "pu_method", nullable = false)
    private Long method;

    @ManyToOne
    @JoinColumn(name = "pu_User_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public Purchase setId(Long id) {
        this.id = id;
        return this;
    }

    public Calendar getDate() {
        return date;
    }

    public Purchase setDate(Calendar date) {
        this.date = date;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public Purchase setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Purchase setAddress(String address) {
        this.address = address;
        return this;
    }

    public Long getMethod() {
        return method;
    }

    public Purchase setMethod(Long method) {
        this.method = method;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Purchase setUser(User user) {
        this.user = user;
        return this;
    }
    
    }