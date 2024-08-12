package com;

public class Persona {
	//ABSTRACCIÓN; inplica definir los atributos de los objetos que queremos crea(idea de lo que queremos crear)
	
	//Definimos "atributos" de nuestra persona
	
	//ENCAPSULACION -Pilar de la POO, que protege la informacion
	//de ser cambiada desde distintos niveles
	//para ello se utilizan los modificadores de acceso
	//private, public protected, default
	private String nombre; 
	private int edad;
	private String genero;
	
	//Creamos metodos "constructores" -Nos permiten inicializar
	//a nuestros objetos
	
	//Constructor  vacio
	public Persona() {		
	}
	
	//Constructor con todos los parametros
	//Nos permite inicializar nuestro objeto con todos los atributos desde un inicio
	public Persona(String nombre, int edad, String genero) {
		super(); //"super" se utiliza cuando veamos herencia, entrando a clases padres, clase hija
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
	
	//Getter & setters
	//Metodos getter - devuelven el valor guardado del atributo
	
	//Metodo setter - nos permiten establecer o asignar de un nuevo valor a un atributo

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
	
	//Metodo toString()
	//Nos permite visualizar los elementos que componen a nuestro objeto en una impresion
	//en consola, ua que se convierte sus valores a String o cadena de texto
	//Funciona como una "radiografia" de objeto

	@Override //Sobreescritura /se estara modificando para cada objeto especifico
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	/*
	 * PLANTILLA BASICA PARA CREAR OBJETOS
	 * Cuando creamos una clase se compone de;
	 * 1. Atributos
	 * 2. Constructores
	 * 3. Getter y setter
	 * 4.toString
	 */
	
}