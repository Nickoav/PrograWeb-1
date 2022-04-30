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
@Table(name="purchasedetails")
public class Purchasedetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="quantity", nullable = false)
    private Long quantity;

    @Column(name="amount", nullable = false)
    private Long amount;

    @Column(name= "igv", nullable = false)
    private Long igv;
    
    @Column(name= "shipcost", nullable = false)
    private Long shipcost;

    @ManyToOne
    @JoinColumn(name = "Product_id", nullable = false)
    private Product product;
    
    @OneToOne
    @JoinColumn(name = "Purchase_id", nullable = false)
    private Purchase purchase;

    public Long getId() {
        return id;
    }

    public Purchasedetail setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Purchasedetail setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public Long getAmount() {
        return amount;
    }

    public Purchasedetail setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    public Long getIgv() {
        return igv;
    }

    public Purchasedetail setIgv(Long igv) {
        this.igv = igv;
        return this;
    }
    
    public Long getShipcost() {
        return shipcost;
    }

    public Purchasedetail setShipcost(Long shipcost) {
        this.shipcost = shipcost;
        return this;
    }
    
    public Product getProduct() {
        return product;
    }

    public Purchasedetail setProduct(Product product) {
        this.product = product;
        return this;
    }
    
    public Purchase getPurchase() {
        return purchase;
    }

    public Purchasedetail setPurchase(Purchase purchase) {
        this.purchase = purchase;
        return this;
    }
    }