package com;

public class Persona {
	//El pilar de la ABSTRACCI�N define los atributos de los objetos
	//que queremos crear
	//atributos
	//La ENCAPSULACI�N es un pilar de la programaci�on orientada a objetos 
	//que protege a la informaci�n de ser cambiada desde diferentes mofidicadores
	//de acceso, los cuales son: private,public, protected y default
	private String nombre;
	private int edad;
	private String genero;
	//Los M�TODOS CONSTRUCTORES nos permiten inicializar nuestros objetos.
	
	//Constructor vac�o
	public Persona() {
		   
	}
	//Constructor con todos los par�metros
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
	//Los m�todos Getter devuelven el valor del atributo guardado
	
	//Los m�todos Setter nos permiten establecer asignar un nuevo valor a un atributo
	public String getNombre() {
		return nombre;
	}
	@Override//SE va a estar modificando el m�todo para cada objeto espec+ifico
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
