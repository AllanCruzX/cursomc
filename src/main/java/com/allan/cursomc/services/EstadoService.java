package com.allan.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allan.cursomc.domain.Estado;
import com.allan.cursomc.repositories.EstadoRepository;



@Service

public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return  repo.findAllByOrderByNome();
	}

}
