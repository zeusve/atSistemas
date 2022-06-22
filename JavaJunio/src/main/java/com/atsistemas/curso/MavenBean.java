package com.atsistemas.curso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class MavenBean {
	private String nombre;
	//private String apellido;
}
