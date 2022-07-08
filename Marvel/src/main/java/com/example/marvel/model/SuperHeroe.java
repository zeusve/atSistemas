package com.example.marvel.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Universo universo;

	@JoinTable(
	        name = "rel_superheroe_poder",
	        joinColumns = @JoinColumn(name = "FK_SUPERHEROE", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_PODER", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Poder> poderes;

}
