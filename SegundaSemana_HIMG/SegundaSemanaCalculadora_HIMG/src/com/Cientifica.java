package com;

public class Cientifica extends Calculadora implements ITermometro, IAvion {
	
	// Lo que me interesa de esta clase es que 
	// me permita crear objetos de los cuales
	// unicamente me interesa llamar a sus métodos.
	
	// Si quiero poder visualizar los atributos de la Calculadora 
	// de esta clase que hereda. 
	// Puedo generar el constructor desde la clase padre
	// Click derecho>>Source>>Generate Constructor from Superclass
	
	/*
	public Cientifica() {
		super();
		
	}

	public Cientifica(String marca, String color, String tamaño, String modelo) {
		super(marca, color, modelo);
		
	}
*/
	
	// Otra forma de crearle constructores a esta clase seria 
	// declarar primero un atributo y de ahi generar el constructor
	// incluyendo el de la clase padre.
	public boolean celdaSolar;
	public Cientifica(String marca, String color, String modelo, boolean celdaSolar) {
		super(marca, color, modelo);
		this.celdaSolar = celdaSolar;
	}

	
	@Override
	public void sumar(double a, double b) {
		System.out.println("El resultado de la suma es: " + (a + b));
		
	}

	@Override
	public void restar(double a, double b) {
		System.out.println("El resultado de la resta es: " + (a - b));
		
	}

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("El resultado de la multiplicación es: " + (a * b));
		
	}

	@Override
	public void dividir(double a, double b) {
		if(b != 0) {
		System.out.println("El resultado de la división es: " + (a / b));
		}else {
			System.out.println("No se puede dividir entre 0...");
		}
	}

	public void tomarTemperatura() {
		System.out.println("Temperatura normal..");
		
	}

	@Override
	public void volar() {
		System.out.println("Ahora podemos volar....");
		
	}
	

	

}
