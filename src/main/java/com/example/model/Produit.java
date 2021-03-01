package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
@Table(name="produit")
public class Produit implements Serializable {
	
	private int idPdt;
	private String nomPdt;
	private String description;
	private double prix;
	private String photo;//on stocke le nom de la photo
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Produit(String nomPdt, String description, double prix, String photo) {
		super();
		this.nomPdt = nomPdt;
		this.description = description;
		this.prix = prix;
		this.photo = photo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdPdt() {
		return idPdt;
	}
	public void setIdPdt(int idPdt) {
		this.idPdt = idPdt;
	}
	public String getNomPdt() {
		return nomPdt;
	}
	public void setNomPdt(String nomPdt) {
		this.nomPdt = nomPdt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
