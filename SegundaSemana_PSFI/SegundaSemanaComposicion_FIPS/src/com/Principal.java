package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a "instanciar" nuestras clases
		
		//"instancia" -Es el objeto que crea apartir de una clase 
		//Primero debo crear los objetos pequeños antes de crear el mas grande 
		
		
		
		//¿Cual es la dferencia entre una instancia y un objeto?
		//Es lo mismo 
		//"Memoria" - Clase
		// "adata" - Objeto instancia
		
		/*
		 * ¿Cual es la diferencia entre clase y objeto?
		 * La clase es la plantilla o molde para generar nuestro objeto 
		 * 
		 * El objeto es la creacion de la variable apartir de esa clase
		 * 
		 * Un CONSTRUCTOR EN JAVA - es un metodo que se llama cuando se 
		 * crea una instancia(objeto) de una clase, principalmente se llega a utilizar poara dar valores iniciales al objeto
		 */
		
		Memoria adata = new Memoria ("Adata", "A6", 8); 
		
		Procesador intel = new  Procesador("Intel", "i5", 4.5);
		
		Almacenamiento Kingston = new Almacenamiento("Kingston", "SSD", 480);
		
		Laptop hp = new Laptop("HP", "44067", "Plata", adata, intel, Kingston);
		
		System.out.println(hp);	
		
		//Cambio el precio de mi precio.static y establecemos nuevos precios para los nuevos productos
		//Laptop.setPrecio(25000); Al agregar el modificador final, se crean valores INMUTABLES 
		//y estos ya no pueden ser cambiados de ninguna forma
		
		//Ejemplo creamos otra laptop lenovo y vemos que conserva el mismo precio por el valor static
		Laptop Lenovo = new Laptop ("Lenovo", "L6", "Negra", adata, intel, Kingston); 
		System.out.println(Lenovo);
	}

}
