package com;

public class Gerente extends Empleado{
	         private String departamento;
	         private String zona;
	         private String prestaciones;
	         public Gerente() {}
			/**
			 * @param nomnbre
			 * @param edad
			 * @param genero
			 * @param rfc
			 * @param salario
			 * @param turno
			 * @param departamento
			 * @param zona
			 * @param prestaciones
			 */
			public Gerente(String nombre, int edad, String genero, String rfc, double salario, String turno,
					String departamento, String zona, String prestaciones) {
				super(nombre, edad, genero, rfc, salario, turno);
				this.departamento = departamento;
				this.zona = zona;
				this.prestaciones = prestaciones;
			}
			@Override
			public String toString() {
				return "Gerente [departamento=" + departamento + ", zona=" + zona + ", prestaciones=" + prestaciones
						+ ", toString()=" + super.toString() + "]";
			}
			public String getDepartamento() {
				return departamento;
			}
			public void setDepartamento(String departamento) {
				this.departamento = departamento;
			}
			public String getZona() {
				return zona;
			}
			public void setZona(String zona) {
				this.zona = zona;
			}
			public String getPrestaciones() {
				return prestaciones;
			}
			public void setPrestaciones(String prestaciones) {
				this.prestaciones = prestaciones;
			}
	         

}
