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

    @Column(name="qty", nullable = false, length = 100)
    private Long qty;

    @Column(name="amount", nullable = false, length = 100)
    private Long amount;

    @Column(name= "igv", nullable = false, length = 100)
    private Long igv;
    
    @Column(name= "shipcost", nullable = false, length = 100)
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

    public Long getQty() {
        return qty;
    }

    public Purchasedetail setQty(Long qty) {
        this.qty = qty;
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