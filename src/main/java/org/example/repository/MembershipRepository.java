package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Membership;

@Named
public class MembershipRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Membership membership) throws Exception{
		em.persist(membership);
		return membership.getId();
	}
	
	public Long update(Membership membership) throws Exception{
		em.merge(membership);
		return membership.getId();
	}
	
	public List<Membership> findAll()  throws Exception{
		List<Membership> memberships=new ArrayList<>();
		TypedQuery<Membership> query=em.createQuery("FROM User u", Membership.class);
		memberships=query.getResultList();		
		return memberships;
	}
	
	
	public List<Membership> findByNickname(String nickname)  throws Exception{
		List<Membership> memberships=new ArrayList<>();
		TypedQuery<Membership> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", Membership.class);
		query.setParameter(1, "%"+nickname+"%");
		memberships=query.getResultList();		
		return memberships;
	}
}