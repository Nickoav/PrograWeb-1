package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Membership;
import org.example.repository.MembershipRepository;

@Named
public class MembershipBusiness implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MembershipRepository membershipRepository;
	
	@Transactional
	public Long insert(Membership membership) throws Exception{
		return membershipRepository.insert(membership);
	}
	
	@Transactional
	public Long update(Membership membership) throws Exception{
		return membershipRepository.update(membership);
	}
		
	public List<Membership> getAll() throws Exception{
		return membershipRepository.findAll();
	}
	

}
