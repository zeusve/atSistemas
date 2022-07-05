package com.example.marvel.service;

import java.util.List;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import com.example.marvel.model.SuperHeroe;

public interface SuperHeroeService {
	SuperHeroe createSuperHeroe(SuperHeroe newSuperHeroe);
	List<SuperHeroe> findAllSuperHeroe() throws ResourceNotFoundException;

}
