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
@Table(name="Product_Suppliers")
public class Product_Supplier implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="price", nullable = true)
    private Float price;

    @Column(name="stock", nullable = false)
    private Long stock;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supplier supplier;
    
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Long getId() {
        return id;
    }

    public Product_Supplier setId(Long id) {
        this.id = id;
        return this;
    }

    public Float getprice() {
        return price;
    }

    public Product_Supplier setStock(Float price) {
        this.price =price;
        return this;
    }

    public Long getStock() {
        return stock;
    }

    public Product_Supplier setTag(Long stock) {
        this.stock = stock;
        return this;
    }
    
    public Product getProduct() {
        return product;
    }

    public Product_Supplier setProduct(Product product) {
        this.product = product;
        return this;
    }
    
    public Supplier getSupplier() {
        return supplier;
    }

    public Product_Supplier getSupplier(Supplier supplier) {
        this.supplier =supplier;
        return this;
    }

}
