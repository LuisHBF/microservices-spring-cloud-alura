package br.com.alura.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	public void realizaCompra(CompraDTO compra) {

		RestTemplate client = new RestTemplate();
		String estado = compra.getEndereco().getEstado();
		ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/" + estado, HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
		
	}

}
