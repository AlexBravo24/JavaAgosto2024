package com;

public class Laptop {
	
	private String marca;
	private String modelo;
	private String color;
	//La palabra static se utiliza cuando queremos utilizar atributos
	//o métodos de clase, que en teoría no van a cambiar, pero aún podemos modificar
	//A veces de la mano con el modificado static se utiliza también el modificador final
	//para poder crear constantes o valores o propiedades inmutables
	private final static double precio = 20000;
	private Memoria ram;
	private Procesador cpu;
	private Almacenamiento disco;
	
	public Laptop() {}

	public Laptop(String marca, String modelo, String color, Memoria ram, Procesador cpu, Almacenamiento disco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ram = ram;
		this.cpu = cpu;
		this.disco = disco;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	/*
	public static void setPrecio(double precio) {
		Laptop.precio = precio;
	}
	*/
	

	public Memoria getRam() {
		return ram;
	}

	public void setRam(Memoria ram) {
		this.ram = ram;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", ram="
				+ ram + ", cpu=" + cpu + ", disco=" + disco + "]";
	}

}
