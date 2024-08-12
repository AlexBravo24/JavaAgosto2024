package com;

public class Cientifica extends Calculadora implements ITermometro, IAvion{
	
	

	//Lo que me interesa de esta clase es que
	//me permita crear objetos de los cuales
	//unicamente me interesa llamar a sus métodos
	
	//Si quiero poder visualizar los atributos de la Calculadora
	//en esta clase que hereda
	//Puedo generar el constructor desde la clase padre
	//Click derecho>Source>Generate Contructor from Superclass
	
	/*
	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
		// TODO Auto-generated constructor stub
	}
*/
	
	//Otra forma de crearle constructores a esta clase sería
	//declarar primero un atributo, y de ahí generar el constructor
	//incluyendo el de la clase padre
	
	public boolean celdaSolar;
	
	public Cientifica() {}
	
	public Cientifica(String marca, String color, String modelo, boolean celdaSolar) {
		super(marca, color, modelo);
		this.celdaSolar = celdaSolar;
	}


	@Override
	public void sumar(int a, int b) {
	System.out.println("El resultado de la suma es: " + (a+b));
		
	}

	

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de la resta es: " + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de la multiplicacion es: " + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("El resultado de la division es: " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
	}
}
