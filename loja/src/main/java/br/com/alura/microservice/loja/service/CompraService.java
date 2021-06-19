package br.com.alura.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {


	@Autowired
	private RestTemplate client;
	
	public void realizaCompra(CompraDTO compra) {

		String estado = compra.getEndereco().getEstado();
		ResponseEntity<InfoFornecedorDTO> exchange = this.client.exchange("http://fornecedor/info/" + estado, HttpMethod.GET, null, InfoFornecedorDTO.class);
		System.out.println(exchange.getBody().getEndereco());
		
	}

}
