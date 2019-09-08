package com.desarrollo.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/", "/home", "/index", "" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola mundo desde Spring");
		return "index";
	}
}
