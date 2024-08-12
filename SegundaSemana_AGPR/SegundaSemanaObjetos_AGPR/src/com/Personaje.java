package com;

public class Personaje {
	private String nombre;
	private String genero;
	private int edad;
	private String habilidad;

	public Personaje() {
	}
	

	public Personaje(String nombre, String genero, int edad, String habilidad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.habilidad = habilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", habilidad=" + habilidad
				+ "]";
	}
	
	

}
