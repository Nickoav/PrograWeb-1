package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.User;
import org.example.repository.UserRepository;

@Named
public class UserBusiness implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Inject
	private UserRepository userRepository;
	
	@Transactional
	public boolean insert(User user) throws Exception{
		userRepository.insert(user);
		if(user==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Transactional
	public Long update(User user) throws Exception{
		return userRepository.update(user);
	}
	
	@Transactional
	public void delete(User user) throws Exception{
		userRepository.delete(user);
	}
	
	public List<User> getAll() throws Exception{
		return userRepository.findAll();
	}
	
	public List<User> getByEmailandPass(String email, String password) throws Exception{
		return userRepository.findByEmailandPass(email,password);
	}
	

}
