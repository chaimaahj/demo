package com.example.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Client;
import com.example.model.Commande;
import com.example.model.Panier;
import com.example.repositories.CommandeRepository;

@RequestMapping("/cmd")
@Controller
public class CommandeController {
	
	@Autowired
    private CommandeRepository cmd;
	
	public void passerCmd(Client cl, Panier pn)
	{
		
	}
	
	public String ShowCmd() {
		Collection<Commande> cmds=null;
		for(Commande c:cmd.findAll())
		{
			cmds.add(c);
			System.out.println("Le détail de ma commande: " +c);
		}
		return "cmdView";
	}
	
	

}
