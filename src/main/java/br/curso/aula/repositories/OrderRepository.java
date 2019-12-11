package br.curso.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.curso.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
