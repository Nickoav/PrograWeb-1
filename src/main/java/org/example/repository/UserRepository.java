package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.User;

@Named
public class UserRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public void insert(User user) throws Exception{
		em.persist(user);

	}
	
	public Long update(User user) throws Exception{
		em.merge(user);
		return user.getId();
	}
	
	public void delete(User user) throws Exception{
		em.remove(user);
	}
	
	public List<User> findAll()  throws Exception{
		List<User> users=new ArrayList<>();
		TypedQuery<User> query=em.createQuery("FROM User u", User.class);
		users=query.getResultList();		
		return users;
	}
	
	
	public List<User> findByEmailandPass(String email, String password)  throws Exception{
		List<User> users=new ArrayList<>();
		TypedQuery<User> query=em.createQuery("FROM User u WHERE u.email LIKE ?1 AND u.password LIKE ?2", User.class);
		query.setParameter(1,email);
		query.setParameter(2, password);
		users=query.getResultList();		
		return users;
	}
}