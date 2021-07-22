package com.will.gubee.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Produtos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotEmpty(message = "Campo nome do produto é mandatorio")
	private String productName;
	@NotEmpty(message = "Campo Descrição do Produto é mandatorio")
	private String description;
	@NotEmpty(message = "Campo mercado Alvo é mandatorio")
	@ElementCollection(targetClass = String.class)
	private List<String> targetMarket;
	@NotEmpty(message = "Campo Stack é mandatorio")
	@ElementCollection(targetClass = String.class)
	private List<String> Stack;

	public Produtos() {
		super();

	}

	public Produtos(String productName, String description, List<String> targetMarket, List<String> stack) {
		super();
		this.productName = productName;
		this.description = description;
		this.targetMarket = targetMarket;
		Stack = stack;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(List<String> targetMarket) {
		this.targetMarket = targetMarket;
	}

	public List<String> getStack() {
		return Stack;
	}

	public void setStack(List<String> stack) {
		Stack = stack;
	}

}
