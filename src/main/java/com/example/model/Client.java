package com.example.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Client implements Serializable{
	
	private int idClt;
	private String nomClt;
	private String prenomClt;
	private String adresse;
	private String email;
	private String tel;
	@OneToMany(mappedBy="client")
	private Collection<Commande> cmds;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomClt, String prenomClt, String adresse, String email, String tel,
			Collection<Commande> cmds) {
		super();
		this.nomClt = nomClt;
		this.prenomClt = prenomClt;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.cmds = cmds;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdClt() {
		return idClt;
	}

	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}

	public String getNomClt() {
		return nomClt;
	}

	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}

	public String getPrenomClt() {
		return prenomClt;
	}

	public void setPrenomClt(String prenomClt) {
		this.prenomClt = prenomClt;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
	
}
