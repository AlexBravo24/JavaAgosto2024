package com;
//La HERENCIA nos va a permitir obtener los atributos
//y comportamientos de una clase Padre, en este caso, la clase
//Persona

public class Empleado extends Persona {
			 //Aquí solo declaramos los atributos propios de un empleado porque los de 
			 //Persona los vamos a reciclar o heredar
			private String rfc;
			private double salario;
			private String turno;
			public Empleado() {
			}
			/**
			 * @param nomnbre
			 * @param edad
			 * @param genero
			 * @param rfc
			 * @param salario
			 * @param turno
			 */
			//Para poder crear un empleado con todos los atributos incluyendo los
			// de la clase Persona, debemos elegir el constructos también de la clase persona 
			//al momento de generarlo.
			public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
				super(nombre, edad, genero);
				this.rfc = rfc;
				this.salario = salario;
				this.turno = turno;
			}
			public String getRfc() {
				return rfc;
			}
			public void setRfc(String rfc) {
				this.rfc = rfc;
			}
			public double getSalario() {
				return salario;
			}
			public void setSalario(double salario) {
				this.salario = salario;
			}
			public String getTurno() {
				return turno;
			}
			public void setTurno(String turno) {
				this.turno = turno;
			}
			@Override
			public String toString() {
				return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()="
						+ super.toString() + "]";
			}
			@Override
			//Las clases hijas se ven obligadas a definir los métodos abstractos que heredan de sus clases padre
			public void sumar(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("La suma es: "+(a+b));
				
			}
		
			
				
			}
			
