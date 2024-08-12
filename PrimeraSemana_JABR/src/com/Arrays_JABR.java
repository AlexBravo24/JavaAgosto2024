package com;

public class Arrays_JABR {

	public static void main(String[] args) {
		
		// Los arrays son una estructura o colección de datos
		//de un mismo tipo
		//Una vez declarado su tamaño o longitud estos no pueden cambiar
		//en tiempo de ejecución
		
		String [] nombres = new String [3]; //ejemplo declaración de un
		//array ya con su tamaño iniciado o declarado
		
		//Procedemos a guardar los elementos en el array
		//indicando la posición donde vamos a almacenar dicho elemento
		
		nombres[2] = "Fatima";
		nombres[0] = "Hugo";
		nombres[1] = "Francisco";
		//nombres[3] = "Humberto";
		
		//Si quiero mandar a imprimir o darle salida a mis datos en consola
		//lo hago llamando a la posicion de dicho array
		System.out.println(nombres[1]);
		
		//Podemos utilizar un ciclo para imprimir todos los datos de un array
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		//Vamos a declarar un array de caracteres
		
		char [] nombre = {'A','l','e','x'};
		
		String name = "Alex";
		
		//Vamos a ver que ocurre si quiero imprimir todo el array de caracteres
		System.out.println(nombre);
		
		//Vamos a ver que ocurre si quiero imprimir todo el array de nombres
		System.out.println(nombres);
		
		//for each - para cada elemento
		
		for (String i: nombres) {
			System.out.println(i);
		}
		

	}

}
