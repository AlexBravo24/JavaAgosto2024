package com;

public class Peliculas {
	private String nombre;
	private String genero;
	private String clasificacion;
	private int a�o; 
	private int duracion;
	
	public Peliculas() {
		
	}

	public Peliculas(String nombre, String genero, String clasificacion, int a�o, int duracion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.clasificacion = clasificacion;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", genero=" + genero + ", clasificacion=" + clasificacion + ", a�o="
				+ a�o + ", duracion=" + duracion + "]";
	}
	
	

}
