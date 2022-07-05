package com.example.marvel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.marvel.model.SuperHeroe;

@Repository
public interface SuperHeroeRepository extends CrudRepository<SuperHeroe, Long>{

}
