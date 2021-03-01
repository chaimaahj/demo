package com.example.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Produit;
import com.example.repositories.ProduitRepository;

@RequestMapping("/pdt")
@Controller
public class ProduitController {

	@Autowired
	private ProduitRepository p;
	
	
	
	public Collection<Produit> init(){
		Collection<Produit> pdtList=null;
		p.save(new Produit("produit1","Le premier produit de la marque",100,"image1"));
		p.save(new Produit("produit2","Le deuxième produit de la marque",99,"image2"));
		p.save(new Produit("produit3","Le troisième produit de la marque",150,"image3"));
		for (Produit val:p.findAll())
		{
			pdtList.add(val);
		}
		return pdtList;
	}
	
	@GetMapping(value="/afficher")
	public String showAll() {
		for(Produit prod:p.findAll())
		{
			
			System.out.println("voilà le produit:" + prod);
		}
		return "afficher" ;
	}
	
	@GetMapping("/unproduit")
	public Optional<Produit> getPdtId(@RequestParam int id)
	{
		return p.findById(id);
	}
	
	
		
	
}
