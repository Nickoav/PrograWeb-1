package org.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="closets")
public class Closet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="quantity", nullable = true, length = 100)
    private Long quantity;

    @Column(name="tag", nullable = false, length = 50)
    private String tag;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    

    public Long getId() {
        return id;
    }

    public Closet setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Closet setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public Closet setTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    public User getUser() {
        return user;
    }

    public Closet setUser(User user) {
        this.user = user;
        return this;
    }
    

}