package com.will.gubee;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.will.gubee.domain.Produtos;
import com.will.gubee.repositories.ProdutosRespository;

@SpringBootApplication
public class GubeeApiApplication implements CommandLineRunner {

	
	@Autowired
	private ProdutosRespository repository;

	public static void main(String[] args) {
		SpringApplication.run(GubeeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<String> market = Arrays.asList("Ecommerce", "ERP", "Lojista que não desejam possuir ecommerce");
		List<String> stack = Arrays.asList("Java 10", "Kotlin", "Kafka", "Event Stream", "Redis", "MongoDB");

		List<String> market2 = Arrays.asList("Ecommerce", "ERP", "Loja fisica");
		List<String> stack2 = Arrays.asList("NodeJS", "MongoDB");

		Produtos p1 = new Produtos("Gubee Integrador", "Ferramenta de integração para marketplaces", market, stack);
		Produtos p2 = new Produtos("Gubee Fretes", "Ferramenta para gestão e calculo de fretes", market2, stack2);
		repository.saveAll(Arrays.asList(p1,p2));
		
	}
	
	
}
