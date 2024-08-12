package com;

// Creación del objeto con sus atributos.
public class Medicamentos {
	private String nombre;
	private String pincipioActivo;
	private int gramaje;
	private String presentacion;
	
	// Constructor vacío.
	public Medicamentos() {
		
	}
	
	// Constructor con argumentos.
	public Medicamentos(String nombre, String pincipioActivo, int gramaje, String presentacion) {
		super();
		this.nombre = nombre;
		this.pincipioActivo = pincipioActivo;
		this.gramaje = gramaje;
		this.presentacion = presentacion;
	}

	// Getters y Setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPincipioActivo() {
		return pincipioActivo;
	}

	public void setPincipioActivo(String pincipioActivo) {
		this.pincipioActivo = pincipioActivo;
	}

	public int getGramaje() {
		return gramaje;
	}

	public void setGramaje(int gramaje) {
		this.gramaje = gramaje;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	// Método toString()
	@Override
	public String toString() {
		return "Medicamentos [nombre=" + nombre + ", pincipioActivo=" + pincipioActivo + ", gramaje=" + gramaje
				+ ", presentacion=" + presentacion + "]";
	}

	

}


