package com;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a probar que podemos instanciar una persona
	
		Persona persona1= new Empleado("Pedro", 30, "Masculino", "FAT678120", 25000, "Matutino");
		//Una vez que una clase es abstracta, esta no puede instanciarse (no podemos
		//crear objetos de ella)
		//Si queremos crear personas nos empieza a marcar error; sin embargo, este c�digo se lo heredamos a empleado
		//entonces podemos crear empleados sin problema.
		//Entonces podemos hacer algo que se llama POLIMORFISMO DE ASIGNACI�N
		//Persona Hugo = new Empleado();
		System.out.println(persona1);
		
		//Probar que podemos instancia un empleado con el constructor completo
		
		Empleado empleado1=new Empleado("F�tima", 20, "Femenino", "FAT678120", 25000, "Matutino");
		System.out.println(empleado1);
		//primero puesta rfc, salatio, turno, y despu�s la herencia de nombre, g�nero y edad
		
		//Reemplazar el nombre del empleado 1
		empleado1.setNombre("Ana");
		System.out.println(empleado1);
		
		//ACTIVIDAD
		//Crear una clase Padre, para que esta la herede a otra
		//sus atributos y m�todos
		//Y los mandan a imprimir en una clase principal
		
		
		//VOID
		//Probamos el m�todo propio comer, ya sea a trav�s de persona1, o como el empleado hereda todo de persona,
		//tambi�n puede ejecutar esa acci�n
		
		persona1.comer();
		empleado1.comer();
		
		//Probando el m�todo propio saludar
		persona1.saludar(); //cuando se ejecuta no sale nada porque el m�todo no indicaba
		//no decia que iba a devolver algo en consola
		//para ver el saludo en consola tenemos que mandarlo a imprimir
		System.out.println(persona1.saludar());
		
		
		//PROBANDO POLIMORFISMO COMER-COMIDA
		persona1.comer("pizza");
		empleado1.comer("sushi");
		
		//Probando polimorfismo comida-cantidad
		empleado1.comer("rebanadas de pizza", 4);
		
		persona1.sumar(1, 2);
	}
	
}
