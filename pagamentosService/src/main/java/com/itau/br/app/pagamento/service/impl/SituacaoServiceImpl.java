package com.itau.br.app.pagamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itau.br.app.pagamento.dto.SituacaoDTO;
import com.itau.br.app.pagamento.dto.SituacaoFilterRequestDTO;
import com.itau.br.app.pagamento.dto.SituacaoResponseDTO;
import com.itau.br.app.pagamento.entity.Situacao;
import com.itau.br.app.pagamento.service.SituacaoService;


@Service
public class SituacaoServiceImpl  implements SituacaoService{
	
	private final Logger LOGGER = LoggerFactory.getLogger(SituacaoServiceImpl.class);
	
	
	public SituacaoResponseDTO buscarSituacao(SituacaoFilterRequestDTO filter) {		
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		List<Situacao>  pessoas = new ArrayList<Situacao>();
		
		List<SituacaoDTO> lista = converter(pessoas);

		SituacaoResponseDTO responseDTO = new SituacaoResponseDTO();
		
		responseDTO.setSituacoes(lista);;
				
		return responseDTO;
	}



	private List<SituacaoDTO> converter(List<Situacao> situacoes) {
		List<SituacaoDTO> response = new ArrayList<SituacaoDTO>();
		for (Situacao situacao : situacoes) {
			SituacaoDTO pessoaDTO = new SituacaoDTO(situacao.getCdSituacao(),situacao.getDsSituacao(),situacao.getSgSituacao());
			response.add(pessoaDTO);
		}
		
		return response;
	}
}