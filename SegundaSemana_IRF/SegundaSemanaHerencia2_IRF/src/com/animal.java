package com;

public class animal {
	
	private String color; 
	private String edad; 
	private String altura; 
	
	public animal() {
		
		
	}
	
	
	
	public animal(String color, String edad, String altura) {
		super();
		this.color = color;
		this.edad = edad;
		this.altura = altura;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getEdad() {
		return edad;
	}



	public void setEdad(String edad) {
		this.edad = edad;
	}



	public String getAltura() {
		return altura;
	}



	public void setAltura(String altura) {
		this.altura = altura;
	}



	public void comer() {
		
		System.out.println("comer");
	}

	public void domir() {
		
		System.out.println("dormir");
	}
	
	public void correr() {
		
		System.out.println("correr");
	}



	@Override
	public String toString() {
		return "animal [color=" + color + ", edad=" + edad + ", altura=" + altura + "]";
	}
	
	
}
