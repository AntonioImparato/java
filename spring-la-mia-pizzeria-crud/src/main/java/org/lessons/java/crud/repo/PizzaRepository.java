package org.lessons.java.crud.repo;

import org.lessons.java.crud.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
