package com.example.controllers;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.model.LigneCmd;
import com.example.model.Panier;
import com.example.model.Produit;
import com.example.repositories.PanierRepository;

@Controller
public class PanierController  {

	@Autowired
	private PanierRepository pan;
	HttpSession session;
	private HashMap<Integer,LigneCmd> pdts = new HashMap<Integer,LigneCmd>();
	
	public void ajouterPdt(Produit p, int qte)
	{
		if(pdts.get(p.getIdPdt()) != null)
		{
			LigneCmd l = pdts.get(p.getIdPdt());
			l.setQte(l.getQte()+qte);
			pan.save(new Panier(p.getIdPdt()));
		}
		else {
			LigneCmd l= new LigneCmd();
			l.setPdt(p);
			l.setQte(qte);
			pan.save(new Panier(p.getIdPdt()));
		}
		
	}
				
		
	
	}
	
	
	
