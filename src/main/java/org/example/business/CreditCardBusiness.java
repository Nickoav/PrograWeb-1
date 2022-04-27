package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.CreditCard;
import org.example.repository.CreditCardRepository;

@Named
public class CreditCardBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private CreditCardRepository supplierRepository;
	
	@Transactional
	public Long insert(CreditCard creditcard) throws Exception{
		return supplierRepository.insert(creditcard);
	}
	
	@Transactional
	public void delete(CreditCard creditcard) throws Exception{
		supplierRepository.delete(creditcard);;
	}
	
	public List<CreditCard> getAllByUserId(Long id) throws Exception{
		return supplierRepository.findAllbyUserId(id);
	}
	

}

