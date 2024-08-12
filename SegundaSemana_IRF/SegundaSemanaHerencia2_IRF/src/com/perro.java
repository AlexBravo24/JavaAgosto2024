package com;

public class perro extends animal{
	
	private String name;
	private String raza; 
	
	
	public perro() {}
	
	public perro(String color, String edad, String altura,String name,String raza) {
	
		super(color, edad, altura);
		this.name = name; 
		this.raza = raza; 
	
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void ladrar() {
		
		System.out.println("wou");
	}

	@Override
	public String toString() {
		return "perro [name=" + name + ", raza=" + raza + ", getColor()=" + getColor() + ", getEdad()=" + getEdad()
				+ ", getAltura()=" + getAltura() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	



	
	
	


}
