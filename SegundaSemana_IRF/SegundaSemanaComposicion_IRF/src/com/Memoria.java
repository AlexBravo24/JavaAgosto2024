package com;

public class Memoria {
	
	private String marca; 
	private String modelo;
	private String capacidad; 
	
	public Memoria() {}

	public Memoria(String marca, String modelo, String capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Memoria [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
