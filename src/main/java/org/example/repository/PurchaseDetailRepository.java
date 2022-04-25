package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Purchasedetail;

@Named
public class PurchaseDetailRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Purchasedetail purchasedetail) throws Exception{
		em.persist(purchasedetail);
		return purchasedetail.getId();
	}
	
	public Long update(Purchasedetail purchasedetail) throws Exception{
		em.merge(purchasedetail);
		return purchasedetail.getId();
	}
	
	public List<Purchasedetail> findAll()  throws Exception{
		List<Purchasedetail> purchasedetails=new ArrayList<>();
		TypedQuery<Purchasedetail> query=em.createQuery("FROM User u", Purchasedetail.class);
		purchasedetails=query.getResultList();		
		return purchasedetails;
	}
	
	
	public List<Purchasedetail> findByNickname(String nickname)  throws Exception{
		List<Purchasedetail> purchasedetails=new ArrayList<>();
		TypedQuery<Purchasedetail> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", Purchasedetail.class);
		query.setParameter(1, "%"+nickname+"%");
		purchasedetails=query.getResultList();		
		return purchasedetails;
	}
}