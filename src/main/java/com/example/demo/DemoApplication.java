package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.model.Produit;
import com.example.repositories.ProduitRepository;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages= {"com.example.repositories","com.example.controllers","com.example.model"})
public class DemoApplication implements CommandLineRunner, WebMvcConfigurer{
	
	@Autowired
	 ProduitRepository p;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		p.save(new Produit("produit1","Le premier produit de la marque",100,"image1"));
		p.save(new Produit("produit2","Le deuxième produit de la marque",99,"image2"));
		p.save(new Produit("produit3","Le troisième produit de la marque",150,"image3"));
		
	}

}
