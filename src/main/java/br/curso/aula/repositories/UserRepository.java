package br.curso.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.curso.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
