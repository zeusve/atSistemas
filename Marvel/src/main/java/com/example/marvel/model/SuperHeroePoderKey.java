package com.example.marvel.model;

import java.io.Serializable;
import javax.persistence.Column;

public class SuperHeroePoderKey implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "id_SuperHeroe")
	private Integer superheoreId;

	@Column(name = "id_Poder")
	private Integer poderId;

}
