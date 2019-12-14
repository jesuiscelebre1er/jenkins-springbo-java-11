package br.curso.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.curso.aula.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
