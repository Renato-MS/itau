package com.itau.br.app.pagamento.dto;

import java.io.Serializable;

public class SituacaoFilterRequestDTO implements Serializable{	
		
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
	
}