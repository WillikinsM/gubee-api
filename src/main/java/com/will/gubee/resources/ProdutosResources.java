package com.will.gubee.resources;

import java.net.URI;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.will.gubee.domain.Produtos;
import com.will.gubee.services.ProdutosServices;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/produtos")
public class ProdutosResources {

	@Autowired
	private ProdutosServices service;

	@GetMapping(value = "/{productName}")
	public ResponseEntity<Produtos> findById(@PathVariable String productName) {
		Produtos obj = this.service.findById(productName);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Produtos>> findAll() {
		List<Produtos> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<Produtos> create(@RequestBody Produtos obj) {
		Produtos newObj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{productName}")
				.buildAndExpand(newObj.getProductName()).toUri();
		return ResponseEntity.created(uri).build();

	}

}
