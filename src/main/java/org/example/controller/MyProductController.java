package org.example.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.MyProductBusiness;
import org.example.entities.MyProduct;

@Named
@SessionScoped
public class MyProductController implements Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	private MyProductBusiness myproBusiness;
	
	private MyProduct myproduct;
	
	@PostConstruct
	public void init() {
		myproduct=new MyProduct();
	}

	public String Logout() {
		this.LimpiarFormulario();
		return "Logout";
		
	}
	
	public String Shoppingcar() {
		this.LimpiarFormulario();
		return "Shoppingcar";
		
	}
	
	public String buttonLogin() {
		List<User>Listausuarios;
		try {
			Listausuarios=this.userBusiness.getByEmailandPass(this.user.getEmail(), this.user.getPassword());
			if(!Listausuarios.isEmpty()) {
				user=Listausuarios.get(0);
				return "Menu";
			}
			else {
				return "Login";
			}
			
		} catch (Exception e) {
			return "Login";
		}
		
				
	}
	
	public String Register() {
		this.LimpiarFormulario();
		return "Register";
	}
	
	public String buttonRegister() {
		try {
			boolean Regexitoso=this.userBusiness.insert(user);
			if(Regexitoso) {
				return "Menu";
				}
				else
					return "Register";
			
		} catch (Exception e) {
		return "Register";
		}
		
	}
	
	public String buttoncancelRegister() {
		this.LimpiarFormulario();
		return "Login";
	}
	
	public void LimpiarFormulario() {
		this.myproduct=new MyProduct();	
		
	}
	
	
	
	public UserBusiness getUserBusiness() {
		return userBusiness;
	}

	public void setUserBusiness(UserBusiness userBusiness) {
		this.userBusiness = userBusiness;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
