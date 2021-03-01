package com.example.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Commande implements Serializable {
	
	private int idCmd;
	private Date dateCmd;
	private  double total;
	@OneToMany(mappedBy="commande")
	private Collection<LigneCmd> articles;
	@ManyToOne
	@JoinColumn(name="idClt")
	private Client clt;
	//private Collection<Produit> pdts;
	
	public Commande() {
		super();
		
	}

	public Commande(Date dateCmd, double total, Collection<Produit> pdts) {
		super();
		this.dateCmd = dateCmd;
		this.total = total;
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdCmd() {
		return idCmd;
	}

	public void setIdCmd(int idCmd) {
		this.idCmd = idCmd;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	
	
}