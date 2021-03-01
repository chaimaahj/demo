package com.example.repositories;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Commande;
import com.example.model.Produit;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {
	
	public Collection<Commande> findAll() throws DataAccessException;

}
