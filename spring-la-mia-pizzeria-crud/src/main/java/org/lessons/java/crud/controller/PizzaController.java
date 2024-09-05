package org.lessons.java.crud.controller;

import java.util.List;

import org.lessons.java.crud.model.Pizza;
import org.lessons.java.crud.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/pizze")
public class PizzaController {

    @Autowired
    private PizzaRepository repo;
    
    @GetMapping()
    public String index(Model model, @RequestParam(name = "nome", required = false) String nome) {
        
        List<Pizza> pizze;
        if (nome != null && !nome.isEmpty()) {
            pizze = repo.findByNomeContains(nome);
        } else {
            pizze = repo.findAll(Sort.by("nome"));
        }
        
        model.addAttribute("pizze", pizze);
        return "/pizze/index";
    } 

    @GetMapping("/show/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("pizza", repo.findById(id).get());
        return "/pizze/show";
    }
    
    @GetMapping("/create")
    public String add( Model model) {
    	 model.addAttribute("pizza", new Pizza());
        return "pizze/create";
    }
    
    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("pizza") Pizza formPizza, 
    					BindingResult bindingResult,
    					Model model )
    {
    	if(bindingResult.hasErrors()) {
    		return"pizze/create";
    	}
    	 repo.save(formPizza);
    	return"redirect:/pizze";
    }
    
    public String listPizze(@RequestParam(required = false) String nome, Model model) {
        model.addAttribute("nome", nome);
        return "pizze";
    }
}