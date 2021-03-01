package com.example.repositories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer>{
	
	@Transactional(readOnly = true)
    @Cacheable("produits")
	public Optional<Produit> findById(@Param("id") Integer id);
	public Collection<Produit> findAll() throws DataAccessException;
	
	

}
