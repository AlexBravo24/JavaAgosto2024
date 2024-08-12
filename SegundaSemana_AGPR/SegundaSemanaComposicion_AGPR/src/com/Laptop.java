package com;

public class Laptop {
	
	private String marca;
	private String modelo;
	private String color;
	
	//La palabra static se utiliza cuando queremos usar atributos o métodos de clase,
	//que en teoría no van a cambiar, pero que aún podemos modificar
	//Por ejemplo, asignamos que todas las computadoras cuestan $20,000
	private double precio =20000;
	private Memoria ram; //creamos una clase Memoria
	private Procesador cpu; //creamos una clase Procesador
	private Almacenamiento disco; //creamos una clase Almacenamiento
	
	
	//empezamos con el constructor vacio
	public Laptop () {}


	public Laptop(String marca, String modelo, String color, double precio, Memoria ram, Procesador cpu,
			Almacenamiento disco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
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


	public void setPrecio(double precio) {
		this.precio = precio;
	}


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

	//Constructor de todos los parametros con using fields
	//Cuando pusimos el estatic en precio nos vamos a dar cuenta que ahora no aparecerá el precio
	
	

	