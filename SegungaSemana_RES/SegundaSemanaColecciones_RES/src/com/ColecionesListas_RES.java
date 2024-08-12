package com;

import java.util.ArrayList;
import java.util.List;

public class ColecionesListas_RES {

	public static void main(String[] args) {
		// Las LISTAS son una colecci�n de datos o elementos
		//definida cmono una sucesi�n de los mismos
		//Esta colecci�n se implementa  a trav�s de la interface List
		//y por medio de un array bibimensioable de la clase
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones 
		//m�s utilizadas  y con mejor rendimiento
		//no podemos guardar tipos de datos primitivos
		//pero si datos de tipo Objeto (String, Wrapper, etc)
		//Vamos a aprender como podemos declarar una lista de elementos de
		//tipo String
		List<String> lista = new ArrayList<String>();
		//Agregar eleentos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		//Visualizar una lista en consola
		System.out.println(lista);
		//Visualizar o recuperar un solo elemento de la lista
		System.out.println(lista.get(2));
		//Devuelva un valor booleano si  el elemento existe en la lista
		System.out.println(lista.contains("Gabriela"));
	    //DEvuelve la posici�n donde se encuentra al elemento
		//por primera vez
		System.out.println(lista.indexOf("Alberto"));
		//Devuelve la �ltima posici�n donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		//Eliminar un elemento d emi lista
		lista.remove(5);
		System.out.println(lista);
		//Podemos a�adir elementos a la lista, con .add se a�ade al final de la lista
		//pero podemos a�adir a un elemento en una posici�n espec�fica
		lista.add(2,"Celso");//SE agrega el elemento y desplaza las posiciones
		//no desplaza al elemento indicado
		System.out.println(lista);
		//Desplazar al valor de una determinada posici�n
		lista.set(3, "Sandy");
		System.out.println(lista);
		//Si quiero recorrer o recuperar todos los valores de mi lista
		//y visualizarlos en una nueva l�nea lo hago con un ciclo for
		for(int i=0;i<lista.size();i++) {
		   System.out.println(lista.get(i));
		}
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos objects
		//o si no la parametrizo
		//Parametrizando
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		//como los elementos son de tipo objeto lo �nico que tengo que hacer es convertirlos a 
		//su tipo de dato para poder visualizarlo.
		//Sin parametrizar no s� que tipo de dato tengo, pero igual funciona con advertencias.
		List colection = new ArrayList();
		
		colection.add("Nombre");
		colection.add(23);
		colection.add(3.1416);
		colection.add(true);
		colection.add('$');
		
        System.out.println(colection.get(2));
	}

}
