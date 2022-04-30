package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.MyProduct;

@Named
public class MyProductRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public void insert(MyProduct myproduct) throws Exception{
			em.persist(myproduct);
	}
	
	
	public void delete(MyProduct myproduct) throws Exception{
		em.remove(myproduct);
	}
	
	
	public List<MyProduct> findByName(String name)  throws Exception{
		List<MyProduct> myproducts=new ArrayList<>();
		TypedQuery<MyProduct> query=em.createQuery("FROM MyProduct mp WHERE mp.name LIKE ?1", MyProduct.class);
		query.setParameter(1, "%"+name+"%");
		myproducts=query.getResultList();		
		return myproducts;
	}
}