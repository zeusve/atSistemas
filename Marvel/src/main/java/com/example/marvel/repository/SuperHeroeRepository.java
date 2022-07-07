package com.example.marvel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.marvel.model.SuperHeroe;

@Repository
public interface SuperHeroeRepository extends CrudRepository<SuperHeroe, Long>{
	
//	//search for id
//	Optional<SuperHeroe> findById(Long id);
//	
	//search superheroes name equal string parameter
//	@Query("select sh from SuperHeroe sh where sh.name=?1")
//	List<SuperHeroe> findByNameContains(String name);
}
