package com;

public class Persona {
	//El pilar de la ABSTRACCIÓN define los atributos de los objetos
	//que queremos crear
	//atributos
	//La ENCAPSULACIÓN es un pilar de la programacióon orientada a objetos 
	//que protege a la información de ser cambiada desde diferentes mofidicadores
	//de acceso, los cuales son: private,public, protected y default
	private String nombre;
	private int edad;
	private String genero;
	//Los MÉTODOS CONSTRUCTORES nos permiten inicializar nuestros objetos.
	
	//Constructor vacío
	public Persona() {
		   
	}
	//Constructor con todos los parámetros
	//Nos permite inicializar nuestros objetos con todos sus atributos desde un inicio
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	//Getter && Setters
	//Los métodos Getter devuelven el valor del atributo guardado
	
	//Los métodos Setter nos permiten establecer asignar un nuevo valor a un atributo
	public String getNombre() {
		return nombre;
	}
	@Override//SE va a estar modificando el método para cada objeto espec+ifico
	public String toString() {
		return "Persona [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getGenero()=" + getGenero()
				+ "]";
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
	

}
