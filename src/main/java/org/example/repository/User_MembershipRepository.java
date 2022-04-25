package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.User_Membership;

@Named
public class User_MembershipRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(User_Membership userxmembership) throws Exception{
		em.persist(userxmembership);
		return userxmembership.getId();
	}
	
	public Long update(User_Membership userxmembership) throws Exception{
		em.merge(userxmembership);
		return userxmembership.getId();
	}
	
	public List<User_Membership> findAll()  throws Exception{
		List<User_Membership> userxmemberships=new ArrayList<>();
		TypedQuery<User_Membership> query=em.createQuery("FROM User u", User_Membership.class);
		userxmemberships=query.getResultList();		
		return userxmemberships;
	}
	
	
	public List<User_Membership> findByNickname(String nickname)  throws Exception{
		List<User_Membership> userxmemberships=new ArrayList<>();
		TypedQuery<User_Membership> query=em.createQuery("FROM User u WHERE u.nickname LIKE ?1", User_Membership.class);
		query.setParameter(1, "%"+nickname+"%");
		userxmemberships=query.getResultList();		
		return userxmemberships;
	}
}