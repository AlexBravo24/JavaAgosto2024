package com;

public class Celular {

	private String marca;
	private String modelo; 
	private String color; 
	Camara cam;
	Battery batery; 
	Procesador procesador;

	
	public Celular(String marca, String modelo, String color, Camara cam, Battery batery, Procesador procesador) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cam = cam;
		this.batery = batery;
		this.procesador = procesador;
	}


	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cam=" + cam + ", batery="
				+ batery + ", procesador=" + procesador + "]";
	}
	
	
	


	

}
