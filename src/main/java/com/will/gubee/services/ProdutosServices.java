package com.will.gubee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.gubee.domain.Produtos;
import com.will.gubee.repositories.ProdutosRespository;

@Service
public class ProdutosServices {

	@Autowired
	private ProdutosRespository repository;

	public Produtos findById(String id) {
		Optional<Produtos> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Produtos> findAll() {
		return repository.findAll();
	}

	public Produtos create(Produtos obj) {
		return repository.save(obj);
	}

	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}

}
