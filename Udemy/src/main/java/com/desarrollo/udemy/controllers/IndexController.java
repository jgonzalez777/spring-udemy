package com.desarrollo.udemy.controllers;

import java.util.Arrays;
import java.util.List;

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
		usuario.setEmail("jorge.cana9@gmail.com");
		model.addAttribute("usuario", usuario);//Se pasa al Model el objeto usuario		
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));//Se pasa al Model el string titulo
		return "perfil"; //Se crea la vista perfil.html
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios");//Se pasa al Model el string titulo
		/*
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Jorge", "Gonzalez", "jorge.cana9@gmail.com"));
		usuarios.add(new Usuario("Pedro", "Piedra", "pedro.piedra@gmail.com"));
		usuarios.add(new Usuario("Lucas", "Limon", "lucas.lobos@gmail.com"));*/
		
		List<Usuario> usuarios = Arrays.asList(new Usuario("Jorge", "Gonzalez", "jorge.cana9@gmail.com"),
				new Usuario("Pedro", "Piedra", "pedro.piedra@gmail.com"),
				new Usuario("Lucas", "Limon", "lucas.lobos@gmail.com"),
				new Usuario("Mario", "Santos", "mario.santos@gmail.com"));
		
		model.addAttribute("usuarios", usuarios);//Se pasa al Model la lista usuarios		
		return "listar"; //Se crea la vista perfil.html
	}
}
