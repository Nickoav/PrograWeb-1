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
	
	public Long update(Purchase purchase) throws Exception{
		em.merge(purchase);
		return purchase.getId();
	}
	
	public List<Purchase> findAll()  throws Exception{
		List<Purchase> purchases=new ArrayList<>();
		TypedQuery<Purchase> query=em.createQuery("FROM User u", Purchase.class);
		purchases=query.getResultList();		
		return purchases;
	}
	
	
	public List<Purchase> findByNickname(String nickname)  throws Exception{
		List<Purchase> purchases=new ArrayList<>();
		TypedQuery<Purchase> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", Purchase.class);
		query.setParameter(1, "%"+nickname+"%");
		purchases=query.getResultList();		
		return purchases;
	}
}