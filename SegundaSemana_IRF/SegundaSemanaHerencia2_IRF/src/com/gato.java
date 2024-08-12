package com;

public class gato extends animal{
	
	private String sexo; 
	private String colorPelo;

 
	
	public gato() {
		
		
	}
	
	public gato(String color, String edad, String altura,String sexo, String colorPelo) {
		super(color, edad, altura);
		this.sexo = sexo;
		this.colorPelo = colorPelo;
	}
	
	public void arañar()
	{
		
		System.out.println("raguñar");
	}
	public void tomarLeche()
	{
		
		System.out.println("tomarLeche");
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	@Override
	public String toString() {
		return "gato [sexo=" + sexo + " colorPelo=" + colorPelo + ", getColor()=" + getColor()
				+ ", getEdad()=" + getEdad() + ", getAltura()=" + getAltura() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
