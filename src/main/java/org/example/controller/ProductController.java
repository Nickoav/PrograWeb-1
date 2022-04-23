package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.ProductBusiness;
import org.example.business.SupplierBusiness;
import org.example.entities.Product;

@Named
public class ProductController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ProductBusiness productBusiness;

	@Inject
	private SupplierBusiness supplierBusiness;

	private Product product;
	private List<Product> products;
	
	@PostConstruct
	public void init() {
		
		product=new Product();
		products=new ArrayList<>();
		
		getAllProducts();
	}
	
	public void getAllProducts() {
		try {
			products=productBusiness.getAll();
		} catch (Exception e) {
			
		}
	}
	
	public String newProduct() {
		return "insert.xhtml";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
