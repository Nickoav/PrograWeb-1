package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.MyProduct;
import org.example.entities.Product;
import org.example.entities.User;
import org.example.repository.MyProductRepository;

@Named
public class MyProductBusiness implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MyProductRepository myproductRepository;
	
	@Transactional
	public void insert(User user, Product product) throws Exception{
		myproductRepository.insert(user,product);
	}
	
	
	@Transactional
	public void delete(MyProduct myproduct) throws Exception{
		myproductRepository.delete(myproduct);;
	}
	
	public List<MyProduct> getMyProductsByName(String name) throws Exception{
		return myproductRepository.findByName(name);
	}
}