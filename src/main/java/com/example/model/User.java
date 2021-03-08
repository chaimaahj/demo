package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idU;
	private String email;
	private String password;
	
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdU() {
		return idU;
	}


	public void setIdU(int idU) {
		this.idU = idU;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
