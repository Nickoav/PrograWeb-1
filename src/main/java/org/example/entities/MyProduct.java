package org.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MyProducts")
public class MyProduct implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@ManyToOne
    @JoinColumn(name = "closet_id", nullable = false)
    private Closet closet;
	
	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
	
	public Long getId() {
        return id;
    }

    public MyProduct setId(Long id) {
        this.id = id;
        return this;
    }
    
    public Closet getCloset() {
        return closet;
    }

    public MyProduct setCloset(Closet closet) {
        this.closet = closet;
        return this;
    }
    
    public Product getProduct() {
        return product;
    }

    public MyProduct setProduct(Product product) {
        this.product = product;
        return this;
    }
    
}