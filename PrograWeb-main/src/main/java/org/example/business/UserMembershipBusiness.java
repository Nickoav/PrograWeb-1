package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.User_Membership;
import org.example.repository.User_MembershipRepository;

@Named
public class UserMembershipBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private User_MembershipRepository usermembershipRepository;
	
	@Transactional
	public Long insert(User_Membership usermembership) throws Exception{
		return usermembershipRepository.insert(usermembership);
	}
	
	@Transactional
	public Long update(User_Membership usermembership) throws Exception{
		return usermembershipRepository.update(usermembership);
	}
	
	@Transactional
	public void delete(User_Membership usermembership) throws Exception{
		usermembershipRepository.delete(usermembership);;
	}
	
	public List<User_Membership> getAll(Long id) throws Exception{
		return usermembershipRepository.findByUserId(id);
	}
	


}

