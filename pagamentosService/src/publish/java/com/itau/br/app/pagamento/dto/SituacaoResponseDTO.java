package com.itau.br.app.pagamento.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SituacaoResponseDTO implements Serializable{	
		
	private static final long serialVersionUID = 1L;	
	private List<SituacaoDTO> situacoes = new ArrayList<SituacaoDTO>();
	
	public List<SituacaoDTO> getSituacoes() {
		return situacoes;
	}
	public void setSituacoes(List<SituacaoDTO> situacoes) {
		this.situacoes = situacoes;
	}
	
	

	
	
	
}