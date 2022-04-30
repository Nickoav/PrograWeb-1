package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Supplier;
import org.example.repository.SupplierRepository;

@Named
public class SupplierBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private SupplierRepository supplierRepository;
	
	@Transactional
	public Long insert(Supplier supplier) throws Exception{
		return supplierRepository.insert(supplier);
	}
	
	@Transactional
	public void delete(Supplier supplier) throws Exception{
		supplierRepository.delete(supplier);;
	}
	
	public List<Supplier> getAll() throws Exception{
		return supplierRepository.findAll();
	}
	


}

