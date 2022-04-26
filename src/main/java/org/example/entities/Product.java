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
	

	@Column(name="name", nullable = false, length = 50)
    private String name;
	
    @Column(name="brand", nullable = false, length = 20)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getColor() {
		return color;
	}

	public void setColor(Long color) {
		this.color = color;
	}

	public Long getSecunco() {
		return secunco;
	}

	public void setSecunco(Long secunco) {
		this.secunco = secunco;
	}

	public Long getThirdco() {
		return thirdco;
	}

	public void setThirdco(Long thirdco) {
		this.thirdco = thirdco;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
   
}
