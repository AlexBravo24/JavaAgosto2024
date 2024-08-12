package com;

public class Persona {
	// ABSTRACCI�N - Definir los atributos de los objetos que queremos crear.
	
	// Atributos
	// ENCAPSULACI�N - Es un pilkar de la programaci�n de 
	// ser cambiada desde distintos niveles.
	// Para ello se utilizan los modificadores de acceso:
	// private, public, protected, default.
	private String nombre;
	private int edad;
	private String genero;
	
	// Metodos constructores - Nos permiten inicializar a 
	// nuestro objeto.
	
	// Constructor vac�o.
	public Persona() {
	}
	
    // Constructor con todos los parametros.
	// Nos permte inicializar nuestro objeto con todos sus atributos desde el inicio.
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
	
	// Metodos Getter - Devuleven el valor guardado del atributo.
	
	// M�todos Setter - Nos permiten establecer o asignar el nuevo valor a un atribito.
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
	
	// M�todo toString():
	// Nos permite visualizar los elementos que componen a nuestro objeto en una impresi�n 
	// en consola ya que convierte sus valores a String o cadena de texto.
	// Funciona como una "radiografia" de objeto.

	@Override // Sobreescritura
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
	
	

}
