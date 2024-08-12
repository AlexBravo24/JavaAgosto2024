package com;

public class Persona {

	// ABSTRACCIÓN - Definir los atributos de los objetos
	// que queremos crear

	// Atributos
	//ENCAPSULACION - Pilar de la POO, que protege la informacion
	//de ser cambiada desde distintos niveles
	//Para ello se utilizan los modificadores de acceso
	//private, public, protected, default
	private String nombre;
	private int edad;
	private String genero;

	// Métodos Constructores - Nos permiten inicializar a
	// nuestros objetos

	// Constructor vacio
	public Persona () {
	}

	//Constructor con todos los parametros 
	//Nos permite inicializar nuestro objeto con todos sus atributos desde un inicio
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	//Podemos tener constructores que nos permitan iniciar nuestros objetos
	//solo con determinados atributos
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Getter & Setters
	//Métodos Getter - devuelven el valor guardado del atributo
	
	//Métodos Setter - nos permiten establecer o asignar un nuevo valor a un atributo

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

	//Método toString()
	//Nos permite visualizar los elementos que componen a nuestro objeto en una impresion
	//en consola, ya que convierte sus valores a String o cadena de texto
	//Funciona como una "radiografia" de objeto
	
	@Override //Sobreescritura
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}

}
