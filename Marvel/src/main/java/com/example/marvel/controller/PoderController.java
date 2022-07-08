package com.example.marvel.controller;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.marvel.dto.PoderDTO;
import com.example.marvel.model.Poder;
import com.example.marvel.service.PoderService;

@RestController
public class PoderController {

	private PoderService service;

	/* search superheroe by id */
	@GetMapping("/poder/{id}")
	public PoderDTO searchId(@PathVariable(required = true) Long id) throws ResourceNotFoundException {
		Poder poderDB = service.findById(id);
		PoderDTO poderDTO = convertPoderToDTO(poderDB);
		return poderDTO;
	}

	private PoderDTO convertPoderToDTO(Poder poderDB) {
		return new PoderDTO(poderDB.getId(), poderDB.getNombre());
	}
}
