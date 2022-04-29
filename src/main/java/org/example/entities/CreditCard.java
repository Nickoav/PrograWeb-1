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
@Table(name="cards")
public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="c_num", nullable = false, length = 16)
    private String num;

    @Column(name="c_paym", nullable = false)
    private Long paym;

    @Column(name= "c_exdate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar exdate;
    
    @Column(name= "c_cv", nullable = false)
    private Long cv;

    @ManyToOne
    @JoinColumn(name = "c_User_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public CreditCard setId(Long id) {
        this.id = id;
        return this;
    }

    public Calendar getExdate() {
        return exdate;
    }

    public CreditCard setExdate(Calendar exdate) {
        this.exdate = exdate;
        return this;
    }

    public String getNum() {
        return num;
    }

    public CreditCard setNum(String num) {
        this.num = num;
        return this;
    }

    public Long getPaym() {
        return paym;
    }

    public CreditCard setPaym(Long paym) {
        this.paym = paym;
        return this;
    }

    public Long getCv() {
        return cv;
    }

    public CreditCard setCv(Long cv) {
        this.cv = cv;
        return this;
    }

    public User getUser() {
        return user;
    }

    public CreditCard setUser(User user) {
        this.user = user;
        return this;
    }
    
    }
