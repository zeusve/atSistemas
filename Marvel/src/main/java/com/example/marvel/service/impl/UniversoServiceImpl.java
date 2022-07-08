package com.example.marvel.service.impl;

import java.util.List;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.marvel.model.Universo;
import com.example.marvel.repository.UniversoRepository;
import com.example.marvel.service.UniversoService;

@Service
public class UniversoServiceImpl implements UniversoService {

	UniversoRepository repository;

	@Override
	public Universo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Universo> findAllUniversos() throws ResourceNotFoundException {
		List<Universo> universoFromDB = (List<Universo>) repository.findAll();
		if (universoFromDB.isEmpty()) {
			throw new ResourceNotFoundException("not found");
		}
		return universoFromDB;
	}

}
