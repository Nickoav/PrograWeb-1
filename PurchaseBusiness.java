package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Purchase;
import org.example.repository.PurchaseRepository;

@Named
public class PurchaseBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private PurchaseRepository purchaseRepository;
	
	@Transactional
	public Long insert(Purchase purchase) throws Exception{
		return purchaseRepository.insert(purchase);
	}
	
	
	public List<Purchase> getById() throws Exception{
		return purchaseRepository.findbyId(null);
	}
	
	public List<Purchase> getByUserId() throws Exception{
		return purchaseRepository.findByUserId(null);
	}
	


}

