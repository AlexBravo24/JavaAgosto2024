package com;

public class Cars {

	private String color; 
	private String marca; 
	private float speedMax;
	
	
	@Override
	public String toString() {
		return "Cars [color=" + color + ", marca=" + marca + ", speedMax=" + speedMax + "]";
	}

	public Cars() {

	} 
	
	public Cars(String color, String marca, float speedMax) {
		super();
		this.color = color;
		this.marca = marca;
		this.speedMax = speedMax;
	}

	
	// setters and getters 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(float speedMax) {
		this.speedMax = speedMax;
	} 
	
	
	
	
	
	
}
