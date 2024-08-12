package com;

public class Montacargas {
	private String marca;
	private String modelo;
	private String color;
	private double capacidadCarga;
	private Ruedas ruedas;
	private Motor motor;
	
	public Montacargas() {
		
	}
	
	public Montacargas(String marca, String modelo, String color, double capacidadCarga, Ruedas ruedas, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidadCarga = capacidadCarga;
		this.ruedas = ruedas;
		this.motor = motor;
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

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public Ruedas getRuedas() {
		return ruedas;
	}

	public void setRuedas(Ruedas ruedas) {
		this.ruedas = ruedas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	 public String toString() {
        return "Montacargas [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capacidadCarga="
                + capacidadCarga + " kg, motor=" + motor + ", ruedas=" + ruedas + "]";
	}
	
	
	
	

}
