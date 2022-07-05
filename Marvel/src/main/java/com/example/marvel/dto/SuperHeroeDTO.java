package com.example.marvel.dto;

import java.io.Serializable;
import java.util.List;
import com.example.marvel.model.SuperHeroePoder;
import com.example.marvel.model.Universo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SuperHeroeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombre;
	private boolean live;
	private Integer universo_id;
	private Universo universo;
	private List<SuperHeroePoder> poderes;

}
