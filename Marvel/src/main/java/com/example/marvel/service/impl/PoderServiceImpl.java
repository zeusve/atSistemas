package com.example.marvel.service.impl;

import java.util.Optional;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.marvel.model.Poder;
import com.example.marvel.repository.PoderRepository;
import com.example.marvel.service.PoderService;

@Service
public class PoderServiceImpl implements PoderService {

	PoderRepository repository;

	@Override
	public Poder findById(Long id) throws ResourceNotFoundException {
		Optional<Poder> poderDB = repository.findById(id);
		if (poderDB.get().getId() != id) {
			throw new ResourceNotFoundException("Poder not found");
		}
		return poderDB.get();
	}

}
