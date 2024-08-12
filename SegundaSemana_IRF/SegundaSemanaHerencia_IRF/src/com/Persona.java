package com;

public class Persona {
	
	private String nombre;
	private int edad; 
	private String genero;
	
	
	public Persona() {
		
		
	}
	public Persona(String nombre, int edad, String genero) {

		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public void comer() {
		
		System.out.println("Estoy comiendo...");
	}
	
	public void comer(String comida ) {
		System.out.println("Estoy comiendo" + comida);
	}
	

	public String saludar() {
		
		String saludo = "hola mundo..."; 
		return saludo;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	} 
	
	
	
	
	

}
