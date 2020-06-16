package com.itau.br.app.pagamento.service;

import com.itau.br.app.pagamento.dto.SituacaoFilterRequestDTO;
import com.itau.br.app.pagamento.dto.SituacaoResponseDTO;

public interface SituacaoService {
	
	public SituacaoResponseDTO buscarSituacao(SituacaoFilterRequestDTO filter);

}
