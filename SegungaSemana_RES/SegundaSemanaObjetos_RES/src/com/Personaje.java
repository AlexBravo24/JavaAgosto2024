package com;

public class Personaje {
			 private String nombre;
			 private String habilidad;
			 private String lugarDeNacimiento;
			 Personaje(){
				 
			 }
			public Personaje(String nombre, String habilidad, String lugarDeNacimiento) {
				super();
				this.nombre = nombre;
				this.habilidad = habilidad;
				this.lugarDeNacimiento =lugarDeNacimiento;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getHabilidad() {
				return habilidad;
			}
			public void setHabilidad(String habilidad) {
				this.habilidad = habilidad;
			}
			public String getLugarDeNacimiento() {
				return lugarDeNacimiento;
			}
			public void setLugarDeNacimiento(String lugarDeNacimiento) {
				this.lugarDeNacimiento = lugarDeNacimiento;
			}
			@Override
			public String toString() {
				return "\nPersonaje\n\nNombre= " + nombre + "\nHabilidad= " + habilidad + "\nLugar de nacimiento= " + lugarDeNacimiento;
			}
			 
			 
}
