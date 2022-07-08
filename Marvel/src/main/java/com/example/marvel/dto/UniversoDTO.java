package com.example.marvel.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UniversoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;

}
