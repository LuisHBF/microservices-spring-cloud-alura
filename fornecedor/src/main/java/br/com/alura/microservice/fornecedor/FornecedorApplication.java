package br.com.alura.microservice.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FornecedorApplication {

	public static void main(String[] args) {
        System.setProperty("spring.cloud.bootstrap.enabled","true");
		SpringApplication.run(FornecedorApplication.class, args);
	}

}
