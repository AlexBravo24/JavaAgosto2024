package com;

public class memoriaRAM {
	         private String marca;
	         private String modelo;
	         private String capacidad;
	         private String fsb;
	         private double precio;
	         memoriaRAM() {
	        	 
	         }
			public memoriaRAM(String marca, String modelo, String capacidad, String fsb, double precio) {
				super();
				this.marca = marca;
				this.modelo = modelo;
				this.capacidad=capacidad;
				this.fsb = fsb;
				this.precio = precio;
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
			public void setCapacidad(String capacidad) {
				this.capacidad = capacidad;
			}
			public String getFsb() {
				return fsb;
			}
			public void setFsb(String fsb) {
				this.fsb = fsb;
			}
			public double getPrecio() {
				return precio;
			}
			public void setPrecio(double precio) {
				this.precio = precio;
			}
			@Override
			public String toString() {
				return "\n\nmemoriaRAM[Marca= " + marca + ",Modelo= " + modelo + ",Capacidad="+capacidad+",FSB= " + fsb + ", precio= " + precio
						+ "]";
			}
			
	         

}
