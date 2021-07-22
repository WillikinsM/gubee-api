package com.will.gubee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.will.gubee.domain.Produtos;

@Repository
public interface ProdutosRespository extends JpaRepository<Produtos, String> {

}
