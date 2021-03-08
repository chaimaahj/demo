package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class LigneCmd implements Serializable {
	private int idLigne;
	@ManyToOne
	@JoinColumn(name="idPdt")
	private Produit pdt;
	private int qte;
	@ManyToOne
	@JoinColumn(name="idCmd")
	private Commande cmd;
	
	public LigneCmd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneCmd(Produit pdt, int qte, double prix) {
		super();
		this.pdt = pdt;
		this.qte = qte;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdLigne() {
		return idLigne;
	}

	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}

	public Produit getPdt() {
		return pdt;
	}

	public void setPdt(Produit pdt) {
		this.pdt = pdt;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	
	

	

}
