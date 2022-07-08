package com.example.marvel.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.marvel.model.Universo;

@Service
public interface UniversoService {

	Universo findById(Long id);

	List<Universo> findAllUniversos();

}
