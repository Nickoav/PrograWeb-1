package org.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="brand", nullable = false, length = 10)
    private String brand;

    @Column(name="size", nullable = false, length = 2)
    private String size;

    @Column(name="cate", nullable = false, length = 10)
    private String cate;

    @Column(name="type", nullable = false, length = 10)
    private String type;

    @Column(name="color", nullable = false, length = 100)
    private Long color;

    @Column(name="secunco", nullable = false, length = 100)
    private Long secunco ;

    @Column(name="thirdco", nullable = false, length = 100)
    private Long thirdco;

    @Column(name="material", nullable = false, length = 10)
    private String material;

    @Column(name="notify", nullable = false, length = 100)
    private Long notify;

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Product setSize(String size) {
        this.size = size;
        return this;
    }

    public String getCate() {
        return cate;
    }

    public Product getCate(String cate) {
        this.cate = cate;
        return this;
    }

    public String getType() {
        return type;
    }

    public Product setType(String type) {
        this.type = type;
        return this;
    }

    public Long getColor() {
        return color;
    }

    public Product setColor(Long color) {
        this.color = color;
        return this;
    }

    public Long getSecunco() {
        return secunco;
    }

    public Product setSecunco(Long secunco) {
        this.secunco = secunco;
        return this;
    }

    public Long getThirdco() {
        return thirdco;
    }

    public Product setThirdco(Long thirdco) {
        this.thirdco = thirdco;
        return this;
    }

    public Long getNotify() {
        return notify;
    }

    public Product setNotify(Long notify) {
        this.notify = notify;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Product setMaterial(String material) {
        this.material = material;
        return this;
    }

}
