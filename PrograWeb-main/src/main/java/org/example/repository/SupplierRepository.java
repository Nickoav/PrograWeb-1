package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Supplier;

@Named
public class SupplierRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Supplier supplier) throws Exception{
		em.persist(supplier);
		return supplier.getId();
	}
	
	public void delete(Supplier supplier) throws Exception{
		em.remove(supplier);
	}
	
	public List<Supplier> findAll()throws Exception{
		List<Supplier> suppliers=new ArrayList<>();	
		TypedQuery<Supplier> query=em.createQuery("FROM Supplier s", Supplier.class);
		suppliers=query.getResultList();		
		return suppliers;
	}
	
}
