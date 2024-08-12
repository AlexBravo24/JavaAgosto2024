package com; //nombre del paquete

public class TiposDeDatos { //nombre de la clase
 
	//Cuerpo de la clase
	
	//Creamos sitanxis de metodo
	public static void main(String[] args) {
		//El metodo main es el metodo que nos ermite ejecutar
		//nuestro programa o clase
		
		//CTRL + S guardad cambios
		
		//Comenzamos con "tipos de datos" DATOS PRMITIVOS - NUMERICOS ENTEROS
		//ejemplos de declaracion de una variable sin valor asignado
		
		byte numero;
		
		numero = 127; //aqui hasta esta linea asignamos valor a la variable
		
		//ejemplo de declaracion de variables, pero ya con los valores
		// asignados desde un inicio
		
		byte b = -128; //byte solo admite valores de -128 a 127, ya que es lo que consume un byte
		short s = 32767; //2byte que va de los valores = -32768 a 32767
		int i = 2147483647; //Ocupa 4 bytes = -2147483648 a 2141483647
		long l = 2147483647; //8 bytes = las variables de tipo long requieren un sufijo "L" o "l"
		
		//La variable mas utilizada para manejar valores enteros es el tipo de datos "int"
		//Numericos en punto o coma FLOTANTE (DECIMALES)
		float f = 3.1416123456f; //4 bytes = requiere del sufijo 'F' o 'f'
		double d = 3.141612345612345; // 8 bytes 
		//el tipo de dato mas utilizado para manejo de decimales es el double
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true;
		boolean evalua2 = false; 
		//las variables de tipo boolean son utiles para evaluar expresiones o condiciones
		
		char caracter = '$';
		//Las variables de tipo char solo admiten un caracter a la vez 
		
		//TIPOS DE DATOS ESTRUCURADOS(tipos de datos objeto)
		//Son clases y las vamos a identificar por que el nombre de estos 
		//tipos de datos inicia con mayuscula
		
		//TIPOS DE DATOS WRAPPER O ENVOLTORIO
		//Son clases que "envuelven" a los primitivos para poder otrorgarles
				//algunos metodos o comportamientos
		Byte by = -128;
		Short sh = 32000;
		Integer in = 2000000;
		Long largo = 40000000L;
		
		Boolean boo = true;
		Character a = 'a';
		
		//Tipos de datos cadena de texto = String
		//Nos permite almacenar una secuencia de caracteres
		
		String nombre = "Fatima Irian";
		
		String numeros = "1000";
		
		//Dandole salida a nuestro dato en consola 
		
		System.out.println("Hola mundo");
		
		//Atajo para escribir impresiones de consola
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println(nombre);
		
		//Ejemplo de una suma de 2 numeros
		System.out.println(11+20);
		
		//Ejemplo declarar un valor x, y para realizar una operacion
		int x = 11;
		int y = 20;
		
		System.out.println(x+y);
		
		//Concatentacion 
		//La union de cadenas de texto y valor numericos
		
		System.out.println("La suma es:  " + x+y);
		
	} //cierre del metodo main
	
} //cierre de la clase