package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Product_Supplier;
import org.example.repository.Product_SupplierRepository;

@Named
public class ProductSupplierBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private Product_SupplierRepository productsupplierRepository;
	
	@Transactional
	public Long insert(Product_Supplier supplier) throws Exception{
		return productsupplierRepository.insert(supplier);
	}
	
	@Transactional
	public void delete(Product_Supplier supplier) throws Exception{
		productsupplierRepository.delete(supplier);;
	}
	
	public List<Product_Supplier> getAll() throws Exception{
		return productsupplierRepository.findAll();
	}
	


}
