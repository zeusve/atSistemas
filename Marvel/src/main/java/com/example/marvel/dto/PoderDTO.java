package com.example.marvel.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PoderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombre;

}
