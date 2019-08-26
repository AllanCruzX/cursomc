package com.allan.cursomc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allan.cursomc.domain.Cidade;
import com.allan.cursomc.dto.CidadeDTO;
import com.allan.cursomc.services.CidadeService;

@RestController
@RequestMapping(value="/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeService service;
	

}
