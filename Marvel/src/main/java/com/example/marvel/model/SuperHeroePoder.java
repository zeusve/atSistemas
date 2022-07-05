package com.example.marvel.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SuperHeroePoder")
public class SuperHeroePoder implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private SuperHeroePoderKey id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_superheroe", nullable = false, insertable = false, updatable = false)
	private SuperHeroe superheroe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_poder", nullable = false, insertable = false, updatable = false)
	private Poder poder;

}
