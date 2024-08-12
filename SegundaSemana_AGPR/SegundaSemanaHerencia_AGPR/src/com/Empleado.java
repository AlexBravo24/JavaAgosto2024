package com;

//La HERENCIA nos va a permitir obtener los atrobutos
//y comportamientos de una clase Padre, en este caso, 
//la clase persona (usamos extends nombreClase)

public class Empleado extends Persona{
	
	//Aqu� solo declaramos los atributos propios de un empleado
	//porque los de Persona los vamos a reciclar
	//o heredar
	
	//evitar� que otra vez estemos d�ndole nombre, edad, g�nero
	
	private String rfc;
	private double salario;
	private String turno;
	
	//Generamos el constructor vac�o de forma normal
	
	public Empleado () {}
	
	//En todos los par�metros veremos cambios. Tenemos que elegir los par�metros 
	//de la clase Persona(String, int, String)

	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super(nombre, edad, genero); //esta parte se llena porque proviene de una clase super (padre)
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

	//En to String elegimos inhereted methos>toStrin para ver los atributos heredados
	//adem�s del rfc, el salario y el turno
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	//Las clases hijas de ven obligadas a definir los m�todos abstractos 
	//que hereda de su clase padre

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es: "+(a+b));
		
	}

}
