package com.example.marvel.service;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.example.marvel.model.Poder;

@Service
public interface PoderService {

	/* search super hero by id */
	Poder findById(Long id) throws ResourceNotFoundException;

}
