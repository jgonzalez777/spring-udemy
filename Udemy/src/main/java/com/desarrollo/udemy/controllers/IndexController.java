package com.desarrollo.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desarrollo.udemy.models.Usuario;

@Controller //Anotación para declarar que esta clase es controladora en Spring Framework
@RequestMapping("/app") //Anotación para declarar que la cadena "/app" será la previa para cada método declarado
public class IndexController {
	
	@GetMapping({"/", "/home", "/index", "" })//Un método GET asociado a 4 nombres posibles de URL
	public String index(Model model) {
		model.addAttribute("titulo", "Hola mundo desde Spring");
		return "index";//Nombre que recibe la vista asociada al método index
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jorge");
		usuario.setApellido("Gonzalez");//En la práctica este dato viene de la DB o de un servicio
		model.addAttribute("usuario", usuario);//Se pasa al Model el objeto usuario
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));//Se pasa al Model el string titulo
		return "perfil"; //Se crea la vista perfil.html
	}
}
