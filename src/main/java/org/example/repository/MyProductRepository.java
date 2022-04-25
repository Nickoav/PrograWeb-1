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
	
	public Long insert(MyProduct myproduct) throws Exception{
		em.persist(myproduct);
		return myproduct.getId();
	}
	
	public Long update(MyProduct myproduct) throws Exception{
		em.merge(myproduct);
		return myproduct.getId();
	}
	
	public List<MyProduct> findAll()  throws Exception{
		List<MyProduct> myproducts=new ArrayList<>();
		TypedQuery<MyProduct> query=em.createQuery("FROM User u", MyProduct.class);
		myproducts=query.getResultList();		
		return myproducts;
	}
	
	
	public List<MyProduct> findByNickname(String nickname)  throws Exception{
		List<MyProduct> myproducts=new ArrayList<>();
		TypedQuery<MyProduct> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", MyProduct.class);
		query.setParameter(1, "%"+nickname+"%");
		myproducts=query.getResultList();		
		return myproducts;
	}
}