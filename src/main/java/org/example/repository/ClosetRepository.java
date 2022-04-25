package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.CreditCard;
import org.example.entities.Closet;

@Named
public class ClosetRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Closet closet) throws Exception{
		em.persist(closet);
		return closet.getId();
	}
	
	public Long update(Closet closet) throws Exception{
		em.merge(closet);
		return closet.getId();
	}
	
	public void delete(CreditCard card) throws Exception{
		em.remove(card);
	}
	
	public List<Closet> findByNickname(String nickname)  throws Exception{
		List<Closet> closets=new ArrayList<>();
		TypedQuery<Closet> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", Closet.class);
		query.setParameter(1, "%"+nickname+"%");
		closets=query.getResultList();		
		return closets;
	}
}