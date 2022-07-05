package com.example.marvel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.marvel.dto.SuperHeroeDTO;
import com.example.marvel.model.Greeting;
import com.example.marvel.model.SuperHeroe;
import com.example.marvel.model.SuperHeroePoder;
import com.example.marvel.model.Universo;
import com.example.marvel.service.SuperHeroeService;


@RestController
public class SuperHeroeController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private SuperHeroeService service;
	
	@RequestMapping("/greeting")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	@GetMapping("/superheroe/{id}")
	@ResponseBody
	public SuperHeroeDTO getId(@PathVariable(required = true) String id) {
		Universo Universo = null;
		List<SuperHeroePoder> poderes = new ArrayList<SuperHeroePoder>();
		return new SuperHeroeDTO(1,"superman",true,1,Universo,poderes);
	}
	
	@GetMapping("/superheroes")
	public List<SuperHeroeDTO> superheroe() throws ResourceNotFoundException {
		List<SuperHeroeDTO> response = new ArrayList<>();
		List<SuperHeroe> superHeroesDB = service.findAllSuperHeroe();
	// TODO -> CREATE MAPPING SERVICE
		superHeroesDB.forEach(sh -> response.add(convertSuperHeroetoDTO(sh)));

		return response;
	}
	
	private SuperHeroeDTO convertSuperHeroetoDTO(SuperHeroe superheroe) {
		return new SuperHeroeDTO(null, null, false, null, null, null);
	}
	
}
