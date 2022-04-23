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
@Table(name="productxsuppliers")
public class ProductXSupplier implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="price", nullable = true, length = 2)
    private Float price;

    @Column(name="stock", nullable = false, length = 50)
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

    public ProductXSupplier setId(Long id) {
        this.id = id;
        return this;
    }

    public Float getprice() {
        return price;
    }

    public ProductXSupplier setStock(Float price) {
        this.price =price;
        return this;
    }

    public Long getStock() {
        return stock;
    }

    public ProductXSupplier setTag(Long stock) {
        this.stock = stock;
        return this;
    }
    
    public Product getProduct() {
        return product;
    }

    public ProductXSupplier setProduct(Product product) {
        this.product = product;
        return this;
    }
    
    public Supplier getSupplier() {
        return supplier;
    }

    public ProductXSupplier getSupplier(Supplier supplier) {
        this.supplier =supplier;
        return this;
    }

}
