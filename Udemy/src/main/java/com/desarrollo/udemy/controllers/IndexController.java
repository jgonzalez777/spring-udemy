package com.desarrollo.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Anotación para declarar que esta clase es controladora en Spring Framework
@RequestMapping("/app") //Anotación para declarar que la cadena "/app" será la previa para cada método declarado
public class IndexController {
	
	@GetMapping({"/", "/home", "/index", "" })//Un método GET asociado a 4 nombres posibles de URL
	public String index(Model model) {
		model.addAttribute("titulo", "Hola mundo desde Spring");
		return "index";//Nombre que recibe la vista asociada al método index
	}
}
