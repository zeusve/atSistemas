package com.example.marvel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.example.marvel.model.SuperHeroe;
import com.example.marvel.repository.SuperHeroeRepository;
import com.example.marvel.service.SuperHeroeService;

@Service
public class SuperHeroeServiceImpl implements SuperHeroeService {

	@Autowired
	SuperHeroeRepository repository;

	@Override
	public SuperHeroe createSuperHeroe(SuperHeroe newSuperHeroe) {
		return repository.save(newSuperHeroe);
	}

	@Override
	public List<SuperHeroe> findAllSuperHeroe() throws ResourceNotFoundException {
		List<SuperHeroe> greetingsFromDB = (List<SuperHeroe>) repository.findAll();
		if (greetingsFromDB.isEmpty()) {
			throw new ResourceNotFoundException("no superheroes found in the database!");
		}
		return greetingsFromDB;
	}
}
