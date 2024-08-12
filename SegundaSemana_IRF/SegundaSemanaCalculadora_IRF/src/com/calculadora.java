package com;

public abstract class calculadora {
	
	// atributos 
	private String marca; 
	private String color; 
	private String modelo;
	
	// abstract  methods 
	public abstract float suma(int a, int b);
	
	public abstract float division(int a, int b);
	
	public abstract float resta(int a, int b);
	
	public abstract float multiplicacion(int a, int b);
	
	// constructor 
	public calculadora(String marca, String color, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}
	
	public calculadora() {
		
	}

	
	// getters and setters 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	// toString method 
	
	
	
	
	

}
