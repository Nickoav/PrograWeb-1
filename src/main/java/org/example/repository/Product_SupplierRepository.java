package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Product_Supplier;

@Named
public class Product_SupplierRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Product_Supplier productxsupplier) throws Exception{
		em.persist(productxsupplier);
		return productxsupplier.getId();
	}
	
	public Long update(Product_Supplier productxsupplier) throws Exception{
		em.merge(productxsupplier);
		return productxsupplier.getId();
	}
	
	public List<Product_Supplier> findAll()  throws Exception{
		List<Product_Supplier> productxsuppliers=new ArrayList<>();
		TypedQuery<Product_Supplier> query=em.createQuery("FROM User u", Product_Supplier.class);
		productxsuppliers=query.getResultList();		
		return productxsuppliers;
	}
	
	
	public List<Product_Supplier> findByNickname(String nickname)  throws Exception{
		List<Product_Supplier> productxsuppliers=new ArrayList<>();
		TypedQuery<Product_Supplier> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", Product_Supplier.class);
		query.setParameter(1, "%"+nickname+"%");
		productxsuppliers=query.getResultList();		
		return productxsuppliers;
	}
}