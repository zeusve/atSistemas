package com.example.marvel.model;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Superheroe")
public class SuperHeroe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nombre", nullable = false)
	@NotNull(message = "name cannot be null")
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


}
