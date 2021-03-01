package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.model.Produit;
import com.example.repositories.ProduitRepository;


public class DemoApplication {
	
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}



}
