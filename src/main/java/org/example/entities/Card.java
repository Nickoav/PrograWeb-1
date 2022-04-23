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
public class Card implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="num", nullable = false, length = 16)
    private String num;

    @Column(name="paym", nullable = false, length = 50)
    private Long paym;

    @Column(name= "exdate", nullable = false, length = 100)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar exdate;
    
    @Column(name= "cv", nullable = false, length = 100)
    private Long cv;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public Card setId(Long id) {
        this.id = id;
        return this;
    }

    public Calendar getExdate() {
        return exdate;
    }

    public Card setExdate(Calendar exdate) {
        this.exdate = exdate;
        return this;
    }

    public String getNum() {
        return num;
    }

    public Card setNum(String num) {
        this.num = num;
        return this;
    }

    public Long getPaym() {
        return paym;
    }

    public Card setPaym(Long paym) {
        this.paym = paym;
        return this;
    }

    public Long getCv() {
        return cv;
    }

    public Card setCv(Long cv) {
        this.cv = cv;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Card setUser(User user) {
        this.user = user;
        return this;
    }
    
    }
