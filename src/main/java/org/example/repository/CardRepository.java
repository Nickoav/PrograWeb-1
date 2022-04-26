package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.CreditCard;

@Named
public class CardRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(CreditCard card) throws Exception{
		em.persist(card);
		return card.getId();
	}
	
	public void delete(CreditCard card) throws Exception{
		em.remove(card);
	}
	
	public List<CreditCard> findAllbyUserId(Long id)  throws Exception{
		List<CreditCard> cards=new ArrayList<>();
		TypedQuery<CreditCard> query=em.createQuery("FROM CreditCard cc WHERE cc.user_id LIKE ?1", CreditCard.class);
		query.setParameter(1, id);
		cards=query.getResultList();	
		return cards;
	}
	
	
}