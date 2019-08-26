package com.allan.cursomc.dto;

import java.io.Serializable;

import com.allan.cursomc.domain.Cidade;

public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	Integer id;
	String nome;

	public CidadeDTO() {
	}

	public CidadeDTO(Cidade obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
