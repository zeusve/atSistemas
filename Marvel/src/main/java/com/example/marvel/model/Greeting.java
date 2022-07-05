package com.example.marvel.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Greeting implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private final long id;
	private final String content;

}
