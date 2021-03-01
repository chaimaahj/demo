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
	private ProduitRepository prod;
	
	
	@GetMapping(value="/afficher")
	public String showAll() {
		Collection<Produit> pdtsList = null;
		for(Produit p:prod.findAll())
		{
			pdtsList.add(p);
			System.out.println("voilà le produit:" + p);
		}
		return "afficher" ;
	}
	
	@GetMapping("/unproduit")
	public Optional<Produit> getPdtId(@RequestParam int id)
	{
		return prod.findById(id);
	}
	
	
		
	
}
