package com;

public class Pan {
			 private String nombre;
			 private String colores;
			 private double precio;
			 Pan (){
				 
			 }
			public Pan(String nombre, String colores, double precio) {
				super();
				this.nombre = nombre;
				this.colores = colores;
				this.precio = precio;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getColores() {
				return colores;
			}
			public void setColores(String colores) {
				this.colores = colores;
			}
			public double getPrecio() {
				return precio;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			@Override
			public String toString() {
				return "\nPan\nNombre: " + nombre + "\nColores: " + colores + "\nPrecio:" + precio;
			}
			 
			 
				 

}
