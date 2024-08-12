package com;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a instanciar nuestras clases
		//Primer creamos los objetos pequeños, antes de el más grande
		
		Memoria adata = new Memoria("Adata", "A6", 8);
		//memoria es la clase, adata es el objeto o instancia
		//la clase es la plantialla que permite hacer el objeto o instancia
		
		Procesador intel = new Procesador("Intel", "i5", 4.5);
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		
		//Ya podemos crear ahora sí la laptop porque ta tenemos los objetos pequeños creados
		
		Laptop hp= new Laptop("hp", "440G7", "Plata", 20000, adata, intel, kingston);
		
		System.out.println(hp);
		
		//Van a crear un objeto de composición
		//que se componga de minimo de otros 3 objetos pequeños
		// Ej. celular-camara, procesador, memoria
		
		//Ejemplo: creamos otra laptop Lenovo que conservará el precio porque ya lo pusimos
		//como estático
		
		
		
		//HASTA ESTE PUNTO LAS COMPUTADORAS VALEN $20,000
		
		//AHORA VAMOS A METER UN CAMBIO DE PRECIO
		//Laptop.setPrecio(25000);
		
		Laptop lenovo= new Laptop("Lenovo", "440G7", "Plata", 20000, adata, intel, kingston);
		
		System.out.println(lenovo);
		

	}
}
