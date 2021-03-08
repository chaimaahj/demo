package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Panier;

public interface PanierRepository extends JpaRepository<Panier, Integer> {

	
}
