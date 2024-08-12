package com;

public class Cientifica extends Calculadora implements ITermometro{

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int restar(int a, int b) {
		return a - b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int multiplicar(int a, int b) {
		return a * b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int dividir(int a, int b) {
		if (b == 0) throw new ArithmeticException("No se puede dividir por cero.");
		return a/b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");// TODO Auto-generated method stub
		
	}
	
	

}
