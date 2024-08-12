package com;

// Creación de objeto y sus atributos.
public class Arboles {
	public String nombre;
	public double altura;
    public String fruto;
    
    // Constructor vacío.
    public Arboles() {
    	
    }
    
    // Constructor con argumentos.
	public Arboles(String nombre, double altura, String fruto) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.fruto = fruto;
	}

	// Getters y Setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getFruto() {
		return fruto;
	}

	public void setFruto(String fruto) {
		this.fruto = fruto;
	}
	

	// Método toString().
	@Override
	public String toString() {
		return "Arboles [nombre=" + nombre + ", altura=" + altura + ", fruto=" + fruto + "]";
	}
	
	
	
	
	
    
    

}
