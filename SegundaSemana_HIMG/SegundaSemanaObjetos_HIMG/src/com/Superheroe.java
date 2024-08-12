package com;

// Creación de objeto y sus atributos.
public class Superheroe {
	private String nombre;
	private int edad;
	private String genero;
	private String habilidad;
	
	// Constructor vacío.
	public Superheroe() {
		
	}
	
	// Constructor con argumentos.
	public Superheroe(String nombre, int edad, String genero, String habilidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.habilidad = habilidad;
	}

	// Getters y Setters.
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

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	// Método toString().
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", habilidad=" + habilidad
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
