package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Product;
import org.example.repository.ProductRepository;

@Named
public class ProductBusiness implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProductRepository productRepository;
	
	@Transactional
	public Long insert(Product product) throws Exception{
		return productRepository.insert(product);
	}
	
	@Transactional
	public Long update(Product product) throws Exception{
		return productRepository.update(product);
	}
	
	@Transactional
	public void delete(Product product) throws Exception{
		productRepository.delete(product);;
	}
	
	public List<Product> getAll() throws Exception{
		return productRepository.findAll();
	}
	
	public List<Product> getProductsByName(String name) throws Exception{
		return productRepository.findByName(name);
	}
}



