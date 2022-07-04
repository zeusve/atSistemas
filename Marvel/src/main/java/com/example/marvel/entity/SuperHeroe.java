package com.example.marvel.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Superheroe")
public class SuperHeroe implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre", nullable = false)
	@NotNull(message = "El campo nombre no puede ser nulo")
	private String nombre;
	
	@Column(name = "live")
	private boolean live;

	@Column(name = "universo_id", nullable = false, insertable = true, updatable = false)
	private Integer universo_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "universo_id", insertable = false, updatable = false)
	private Universo universo;

	@OneToMany()
	@JoinColumn(name = "id_poder")
	private List<SuperHeroePoder> poderes;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public Integer getUniverso_id() {
		return universo_id;
	}

	public void setUniverso_id(Integer universo_id) {
		this.universo_id = universo_id;
	}

	public List<SuperHeroePoder> getPoderes() {
		return poderes;
	}

	public void setPoderes(List<SuperHeroePoder> poderes) {
		this.poderes = poderes;
	}

	public Universo getUniverso() {
		return universo;
	}

	public void setUniverso(Universo universo) {
		this.universo = universo;
	}

	
}
