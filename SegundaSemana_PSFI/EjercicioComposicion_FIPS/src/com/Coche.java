package com;

public class Coche {
	
	private String modelo;
	private Motor cilindros;
	private double precio;
	private Neumaticos llantas; 
	private Trasmision fluido; 
	
	public Coche () {}

	public Coche(String modelo, Motor cilindros, double precio, Neumaticos llantas, Trasmision fluido) {
		super();
		this.modelo = modelo;
		this.cilindros = cilindros;
		this.precio = precio;
		this.llantas = llantas;
		this.fluido = fluido;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getCilindros() {
		return cilindros;
	}

	public void setCilindros(Motor cilindros) {
		this.cilindros = cilindros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Neumaticos getLlantas() {
		return llantas;
	}

	public void setLlantas(Neumaticos llantas) {
		this.llantas = llantas;
	}

	public Trasmision getFluido() {
		return fluido;
	}

	public void setFluido(Trasmision fluido) {
		this.fluido = fluido;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", cilindros=" + cilindros + ", precio=" + precio + ", llantas=" + llantas
				+ ", fluido=" + fluido + "]";
	}


}
