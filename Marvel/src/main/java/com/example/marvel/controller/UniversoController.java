package com.example.marvel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.marvel.dto.UniversoDTO;
import com.example.marvel.model.Universo;
import com.example.marvel.service.UniversoService;

@RestController
public class UniversoController {
	private UniversoService service;

	/* search superheroe by id */
	@GetMapping("/universo/{id}")
	public UniversoDTO searchId(@PathVariable(required = true) Long id) throws ResourceNotFoundException {
		Universo universoDB = service.findById(id);
		// CREATE MAPPING SERVICE
		UniversoDTO universoDTO = convertPoderToDTO(universoDB);
		return universoDTO;
	}

	@GetMapping("/universos")
	public List<UniversoDTO> universo() throws ResourceNotFoundException {
		List<UniversoDTO> response = new ArrayList<>();
		List<Universo> universosDB = service.findAllUniversos();
		// CREATE MAPPING SERVICE
		universosDB.forEach(u -> response.add(convertPoderToDTO(u)));
		return response;
	}

	private UniversoDTO convertPoderToDTO(Universo universoDB) {
		return new UniversoDTO(universoDB.getId(), universoDB.getNombre());
	}

}
