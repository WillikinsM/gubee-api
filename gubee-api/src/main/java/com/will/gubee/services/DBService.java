package com.will.gubee.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.gubee.domain.Produtos;
import com.will.gubee.repositories.ProdutosRespository;

@Service
public class DBService {

	@Autowired
	private ProdutosRespository repository;

	public void instanciaBaseDedados() {

		List<String> market = Arrays.asList("Ecommerce", "ERP", "Lojista que não desejam possuir ecommerce");
		List<String> stack = Arrays.asList("Java 10", "Kotlin", "Kafka", "Event Stream", "Redis", "MongoDB");

		List<String> market2 = Arrays.asList("Ecommerce", "ERP", "Loja fisica");
		List<String> stack2 = Arrays.asList("NodeJS", "MongoDB");

		List<String> market3 = Arrays.asList("Ecommerce", "Telecom", "Venda direta", " Mobile First",
				"Digital Onboarding");
		List<String> stack3 = Arrays.asList("Big Data Analytics", "Hadoop", "Kafka", "Pig", "Cassandra");

		Produtos p1 = new Produtos("Gubee Integrador", "Ferramenta de integração para marketplaces", market, stack);
		Produtos p2 = new Produtos("Gubee Fretes", "Ferramenta para gestão e calculo de fretes", market2, stack2);
		Produtos p3 = new Produtos("Gubee AntiFraude", "Ferramenta especialistas em detecção e prevenção à fraude",
				market3, stack3);
		this.repository.saveAll(Arrays.asList(p1, p2, p3));

	}

}
