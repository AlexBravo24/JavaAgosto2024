package com;

public class Arrays_FIPS {

	public static void main(String[] args) {
		// Los arrays contienen grandes cantidades de informacion, dependiendo de las que nosotros le demos acceso
		//son una structura o coleccion de datos
		// de un mismo tipo
		// Una ve declarado su tamaño o longitud estos no pueden cambiar en tiempo de ejecucion
		
		String [] nombres = new String[3]; //Ejeplo declaraciones de un 
		//Array ya con su tamaño iniciado o declarado 
		
		//Procedemos guardar los elementos en el array
		// indicando la posicion donde vamos a almacenar dicho elemento
		
		nombres[2] = "Fatima";
		nombres[0] = "Hugo";
		nombres[1] = "Francisco";
		//nombres[3] = "Humberto";
		
		
		//Si quiero mandar a imprimir o darle salida a mis datos en consola
		//lo hago llamando a la posicion de dicho array 
		
		System.out.println(nombres[1]); //Si tenemos 100 datos para no mandar a trae uno por uno
		
		//podemos utilizar un ciclo para imprimir todos los datos de un array
		for(int i = 0; i< nombres.length; i++) { //metodo .length ( ) = Nos devulve en valor numerico
			System.out.println(nombres[i]);
		}
		
		//declaramos un array de caracter
		char [] nombre = {'A', '1', 'e', 'x'}; //Las variables de tipo char solo admiten un caracter a la vez 
		
		String name = "Alex";
		
		//Vamos a ver que ocurre si quiero imprimir todo el array de caracteres
		System.out.println(nombre);
		
		//Vamos a ver que ocurre si quiero imprimir todo el array de nombres
		System.out.println(nombres);
		
		//for each / para cada elemento
		
		for (String i:nombres) {
			System.out.println(i);
			
		}

	}

}
