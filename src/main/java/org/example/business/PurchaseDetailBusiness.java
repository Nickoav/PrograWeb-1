package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Purchasedetail;
import org.example.repository.PurchaseDetailRepository;

@Named
public class PurchaseDetailBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private PurchaseDetailRepository purchasedetailRepository;
	
	@Transactional
	public Long insert(Purchasedetail purchasedetail) throws Exception{
		return purchasedetailRepository.insert(purchasedetail);
	}
	
	@Transactional
	public Long delete(Purchasedetail purchasedetail) throws Exception{
		return purchasedetailRepository.update(purchasedetail);
	}
	
	public List<Purchasedetail> getByPurchaseId(Long id) throws Exception{
		return purchasedetailRepository.findByPurchaseId(id);
	}
	


}

