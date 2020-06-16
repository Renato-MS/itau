package com.itau.br.app.pagamento.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.itau.br.app.pagamento.dto.SituacaoFilterRequestDTO;
import com.itau.br.app.pagamento.dto.SituacaoResponseDTO;
import com.itau.br.app.pagamento.service.SituacaoService;
import com.itau.br.app.pagamento.service.SituacaoWebService;






@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class SituacaoEndpoint extends SpringBeanAutowiringSupport implements SituacaoWebService{
	
	private final Logger LOGGER = LoggerFactory.getLogger(SituacaoEndpoint.class);
	
	@Autowired
	private SituacaoService pessoaService;
	
	@Autowired
	private SituacaoWebService exampleService;
	
	@WebMethod
	@WebResult(name = "situacaoResponseDTO")
	public SituacaoResponseDTO buscarSituacao(@WebParam(name = "filter") SituacaoFilterRequestDTO filter ) throws WebServiceException{	
		
		SituacaoResponseDTO dto = new SituacaoResponseDTO();
		
		try{
			LOGGER.info("buscar situacoes");
			dto = pessoaService.buscarSituacao(filter);
			LOGGER.info("buscar situacoes sucesso");
			LOGGER.info(dto.toString());
		}catch (Exception e) {
			LOGGER.error(e.getMessage());    		
    		throw new WebServiceException(e.getMessage());
		}
		
		return dto;
	}
}
