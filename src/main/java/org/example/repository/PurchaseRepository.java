package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Purchase;

@Named
public class PurchaseRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Purchase purchase) throws Exception{
		em.persist(purchase);
		return purchase.getId();
	}
	
	
	public List<Purchase> findbyId(Long id)  throws Exception{
		List<Purchase> purchases=new ArrayList<>();
		TypedQuery<Purchase> query=em.createQuery("FROM Purchase p WHERE p.id LIKE ?1", Purchase.class);
		query.setParameter(1, id);
		purchases=query.getResultList();		
		return purchases;
	}
	
	
	public List<Purchase> findByUserId(Long user_id)  throws Exception{
		List<Purchase> purchases=new ArrayList<>();
		TypedQuery<Purchase> query=em.createQuery("FROM Purchase p WHERE p.user_id LIKE ?1", Purchase.class);
		query.setParameter(1, user_id);
		purchases=query.getResultList();		
		return purchases;
	}
}