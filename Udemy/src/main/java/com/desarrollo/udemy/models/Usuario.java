package com.desarrollo.udemy.models;

/*
 * Creación de un objeto Java simple
 * */
public class Usuario {
	
	private String nombre;
	
	private String apellido;
	
	private String email;

	public String getNombre() {
		return nombre;
	}	

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
