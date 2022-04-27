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
	
	public void delete(User_Membership userxmembership) throws Exception{
		em.remove(userxmembership);
	}
	
	
	public List<User_Membership> findByUserId(Long id)  throws Exception{
		List<User_Membership> userxmemberships=new ArrayList<>();
		TypedQuery<User_Membership> query=em.createQuery("FROM User_Membership um WHERE um.user_id LIKE ?1", User_Membership.class);
		query.setParameter(1,id);
		userxmemberships=query.getResultList();		
		return userxmemberships;
	}
}