package org.lessons.java.crud.repo;

import java.util.List;

import org.lessons.java.crud.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

	public List<Pizza> findByNome(String nome);
	
	public List<Pizza> findByNomeContains(String nome);

}
