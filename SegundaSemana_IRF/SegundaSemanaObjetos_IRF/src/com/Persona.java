package com;

public class Persona {
	// atributos 
	// encapsulacion pilar de la poo que proteje la informacion 
	// de ser cambiada desde distintos niveles 
	// para ello se utilizan los modificadores de acceso 
	// privated , public , protected , default 
	 
	private String nombre; 
	private int edad; 
	private String generos; 
	
	// Constructor vacio 
	public Persona() {
		
		
	}
	


	// constructir con todos los parametros
	// nos perimite inizializar con todos los parametros
	public Persona(String nombre, int edad, String generos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.generos = generos;
	}

	// Getters y Setters 
	
	// get obtiene el valor almacenado en la variable
	// el metodo set establece un valor
	

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

	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", generos=" + generos + "]";
	}


	


}
