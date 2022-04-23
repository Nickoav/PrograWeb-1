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

    @Column(name="qty", nullable = true, length = 100)
    private Long qty;

    @Column(name="tag", nullable = false, length = 50)
    private String tag;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Long getId() {
        return id;
    }

    public Closet setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getqty() {
        return qty;
    }

    public Closet setQty(Long qty) {
        this.qty = qty;
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
    
    public Product getProduct() {
        return product;
    }

    public Closet setProduct(Product product) {
        this.product = product;
        return this;
    }

}