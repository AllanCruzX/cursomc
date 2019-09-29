package com.allan.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allan.cursomc.domain.Cidade;
import com.allan.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findCidades(Integer estado_id) {
		return repo.findCidades(estado_id);

	}

}
