package com.example.marvel.service;

import java.util.List;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import com.example.marvel.model.SuperHeroe;

public interface SuperHeroeService {
	SuperHeroe createSuperHeroe(SuperHeroe newSuperHeroe);
	//Search all super heroes in DB
	List<SuperHeroe> findAllSuperHeroe() throws ResourceNotFoundException;
	//search super hero by id
	SuperHeroe findById(Long id) throws ResourceNotFoundException;
	//Query all superheroes that contain, in their name, the value of a parameter sent in the request.
	//List<SuperHeroe> findAllSuperHeroeContain() throws ResourceNotFoundException;
	//create superheroe
	void save(SuperHeroe sh);
	
	List<SuperHeroe> findByNameContains(String name) throws ResourceNotFoundException;;
}