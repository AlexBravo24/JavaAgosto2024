package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a instanciar nuestras clases
		//Primero debo de crear los objetos pequeños antes de crear los objetos grandes
		Memoria adata = new Memoria("adata", "A6", 8);
		Procesador intel = new Procesador("Intel","i5",4.5);
		Almacenamiento kingston = new Almacenamiento("Kingston","SSD",480);
		Laptop hp = new Laptop("HP", "440G7", "Plata", adata, intel, kingston);
		System.out.println(hp);
		//Laptop.setPrecio(25000);Al agregar el modificador final se crean valores inmutables y éstos ya no pueden ser cambiados de ninguna forma.
	    //Ejemplo
        Laptop lenovo= new Laptop("Lenovo","L6","negro", adata, intel, kingston);
        System.out.println(lenovo);
	}

}
