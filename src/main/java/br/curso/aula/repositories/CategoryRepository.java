package br.curso.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.curso.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
