package com;

public class Cientifica extends Calculadora implements ITermometro, Avion {


	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		
	}
	
	 // M�todos adicionales
    public void sumar(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    public void restar(int a, int b) {
        System.out.println("Resta: " + (a - b));
    }

    public void multiplicar(int a, int b) {
        System.out.println("Multiplicaci�n: " + (a * b));
    }

    public void dividir(int a, int b) {
        if (b != 0) {
            System.out.println("Divisi�n: " + ((double) a / b));
        } else {
            System.out.println("Error: Divisi�n por cero.");
        }
        
    }

	@Override
	public void TomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}

	@Override
	public void Volar() {
		System.out.println("Puede volar");
	}
    
  
}
	
