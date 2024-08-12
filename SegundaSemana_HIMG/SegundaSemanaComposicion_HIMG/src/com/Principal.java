package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a instanciar clases.
		// Primero debo crear los objetos pequeños antes de crear el más grande.
		
		Memoria adata = new Memoria("Adata", "A6", 480);
		Procesador intel = new Procesador("Intel", "i5", 4.5);
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", adata, intel, kingston);
		
		System.out.println(hp);
		
		// Laptop.setPrecio(250000); Al agregar el modificador final se crean valores inmutables y 
		// estos ya no pueden ser cambiados de ninguna forma.
		
		// Ejemplo creamos otra latop Lenovo y vemos que conserva el mismo precio
		// por ser un valor estatico.
		Laptop lenovo = new Laptop("Lenovo", "L6", "Negro", adata, intel, kingston);
		System.out.println(lenovo);

	}

}
