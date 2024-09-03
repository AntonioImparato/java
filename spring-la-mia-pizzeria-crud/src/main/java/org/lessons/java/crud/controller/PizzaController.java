package org.lessons.java.crud.controller;

import java.util.List;

import org.lessons.java.crud.model.Pizza;
import org.lessons.java.crud.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizze")
public class PizzaController {

	@Autowired
	private PizzaRepository repo;
	
	@GetMapping()
	public String index (Model model) {
		
		List<Pizza> pizze = repo.findAll();
		model.addAttribute("pizze", pizze);
		return "/pizze/index";
	} 

	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Integer id , Model model) {
		model.addAttribute("pizza", repo.findById(id).get());
		return "/pizze/show";
	}
}
