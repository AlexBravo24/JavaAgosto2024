package com;

public class Peliculas {
	private String nombre;
	private String genero;
	private String clasificacion;
	private int año; 
	private int duracion;
	
	public Peliculas() {
		
	}

	public Peliculas(String nombre, String genero, String clasificacion, int año, int duracion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.año = año;
		this.duracion = duracion;
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

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", genero=" + genero + ", clasificacion=" + clasificacion + ", año="
				+ año + ", duracion=" + duracion + "]";
	}
	
	

}
