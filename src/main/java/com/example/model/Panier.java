package com.example.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Panier implements Serializable {
	
	private int idPanier;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	private HashMap<Integer,LigneCmd> pdts = new HashMap<Integer,LigneCmd>();
	
	
	
		
	
	//avoir le prix total du panier
	public double totalCmd()
	{
		double som = 0;
		for (LigneCmd l : pdts.values())
		{
			som +=l.getPdt().getPrix() * l.getQte();
		}
		return som;
	}
	
	
	public Collection<LigneCmd> allPdts()
	{
		return pdts.values();
	}
	
	//supprimer un produit du panier
	public void deleteProduit(int idPdt)
	{
		pdts.remove(idPdt);
	}
	
}
