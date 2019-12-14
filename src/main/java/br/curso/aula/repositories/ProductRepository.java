package br.curso.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.curso.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
