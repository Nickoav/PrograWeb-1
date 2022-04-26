package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.CreditCard;
import org.example.entities.Product;

@Named
public class ProductRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;
	
	public Long insert(Product product) throws Exception{
		em.persist(product);
		return product.getId();
	}
	
	public Long update(Product product) throws Exception{
		em.merge(product);
		return product.getId();
	}
	
	public void delete(CreditCard card) throws Exception{
		em.remove(card);
	}
	
	public List<Product> findAll()  throws Exception{
		List<Product> products=new ArrayList<>();
		TypedQuery<Product> query=em.createQuery("FROM Product p", Product.class);
		products=query.getResultList();		
		return products;
	}
	
	
	public List<Product> findByName(String name)  throws Exception{
		List<Product> products=new ArrayList<>();
		TypedQuery<Product> query=em.createQuery("FROM Product p WHERE p.name LIKE ?1", Product.class);
		query.setParameter(1, "%"+name+"%");
		products=query.getResultList();		
		return products;
	}
}





