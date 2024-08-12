package com;

public class Principal {

	public static void main(String[] args) {
		
		// Probando que podemos instanciar una Persona
		
		Persona persona1 = new Empleado("Pedro", 30, "Masculino", "FAT678120", 25000, "Matutino");
		//Una vez que una clase es abstracta, esta no puede
		//ser instanciada (no podemos crear objetos de ella)
		System.out.println(persona1);
		
		// Probando que podemos instanciar un Empleado con el constructor completo
		Empleado empleado1 = new Empleado("Fátima", 20, "Femenino", "FAT678120", 25000, "Matutino");
		System.out.println(empleado1);
		
		//Reemplazar el nombre de empleado1
		empleado1.setRfc("FTM18946");
		System.out.println(empleado1);
		
		//Actividad. Crear una clase Padre para que esta le herede a otra
		//sus atributos y métodos
		//Y los mandan a imprimir en una clase Principal
		//Ej. Vehiculo que hereda a algun tranporte especifico
		//Auto, Barco, Tren, Avion, etc
		
		//Probamos el método propio comer
		persona1.comer();
		empleado1.comer();
		
		//Probando el método propio saludar
		persona1.saludar();
		//Si yo quiero ver el saludo en consola tengo que
		//mandarlo a imprimir
		System.out.println(persona1.saludar());
		
		//Probando el método polimorfico comer
		persona1.comer("pizza");
		
		persona1.comer(" rebanadas de pizza", 4);
		
		//Probando el método abstracto ya definido en empleado
		persona1.sumar(10, 17);
		

	}

}
