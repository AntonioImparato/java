package com.example.demo.controllo;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeControllo {
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name") String name,
	ModelMap model) {
	model.addAttribute("name", name);
	model.addAttribute("time", LocalTime.now());
	return "greeting";
	}

	}
