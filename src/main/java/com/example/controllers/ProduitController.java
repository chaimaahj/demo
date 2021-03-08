package com.example.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Produit;
import com.example.repositories.ProduitRepository;


@RequestMapping("/")
@Controller
public class ProduitController {

	@Autowired
	private ProduitRepository p;
	private Collection<Produit> pdtList= null;
	private Optional<Produit> pdt;
	
	
	
	public void init(){
		p.save(new Produit("produit1","Le premier produit de la marque",100,"image1"));
		p.save(new Produit("produit2","Le deuxième produit de la marque",99,"image2"));
		p.save(new Produit("produit3","Le troisième produit de la marque",150,"image3"));
		
	}
	
	@GetMapping(value="/afficher")
	public ModelAndView produitAll() {
		ModelAndView mv = new ModelAndView();
		pdtList=p.findAll();
		mv.setViewName("afficher");
		mv.addObject("pdtList", pdtList);
		return mv;
	}
	

	@GetMapping("/pdt/{idPdt}")
	public String getPdtId(Integer id, Model model)
	{
		pdt = p.findById(id);
		model.addAttribute("pdt",pdt);
		return "pdt";
	}
	
	
		
	
}
