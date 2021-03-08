package com.example.repositories;


import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Commande;


@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer> {
	
	public List<Commande> findAll() throws DataAccessException;

}