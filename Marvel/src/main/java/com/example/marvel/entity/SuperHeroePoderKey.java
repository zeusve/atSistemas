package com.example.marvel.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class SuperHeroePoderKey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_SuperHeroe")
	private Integer superheoreId;
	
	@Column(name = "id_Poder")
	private Integer poderId;
	
	public Integer getPersonaId() {
		return superheoreId;
	}

	public void setPersonaId(Integer superheoreId) {
		this.superheoreId = superheoreId;
	}

	public Integer getDepartamentoId() {
		return poderId;
	}

	public void setDepartamentoId(Integer poderId) {
		this.poderId = poderId;
	}

}
