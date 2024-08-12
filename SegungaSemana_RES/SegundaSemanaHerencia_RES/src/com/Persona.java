package com;

//Una clase abstracta es una clase que contiene por lo menos un método abstracto

public abstract class Persona {
			private String nombre;
			private int edad;
			private String genero;
			public Persona() {
				
			}
			/**
			 * @param nomnbre
			 * @param edad
			 * @param genero
			 */
			public Persona(String nombre, int edad, String genero) {
				this.nombre = nombre;
				this.edad = edad;
				this.genero = genero;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNomnbre(String nombre) {
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
			@Override
			public String toString() {
				return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
			}
			public void comer()
			{
				System.out.println("Estoy comiendo ...");
			}
			//Declarando un método polimórfico del método comer
			public void comer(String comida) {
				System.out.println("Estoy comiendo "+comida);
			}
			public void comer(String comida, int cantidad) {
				System.out.println("Estoy comiento "+cantidad+ " rebanadas de "+comida);
			}
			         
			
			//Debe devolver el tipo de dato que declara al momento de nombrarlo
			public String saludar() {
				//Puedo declarar un String que guarde un saludo
				String saludo="Hola mundo";
				System.out.println(saludo);
				return saludo;
			}
			public abstract void sumar(int a,int b);
}
