package com.example.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.marvel.model.SuperHeroe;
import com.example.marvel.model.SuperHeroePoder;
import com.example.marvel.model.Universo;

@RestController
public class GrettingController {

	private static final String template = "HOLA, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	@GetMapping("/greeting/{id}")
	@ResponseBody
	public SuperHeroe getId(@PathVariable(required = true) String id) {
		Universo Universo = null;
		List<SuperHeroePoder> poderes = new ArrayList<SuperHeroePoder>();
		return new SuperHeroe(1,"superman",true,1,Universo,poderes);
	}
	
	
}
