package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream es una funcionalildad a partir de Java 8
		// Que nos va a permitir gestionar de una forma más
		//rápida e imperativa la información que tengamos
		//en nuestras colecciones de datos
		//Las colecciones se vuelven un flujo de datos a partir
		//del cual podemos solicitar la información que necesitemos.
		Stream<String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
			  .filter(item->item.contains("i"));
		//Una vez filtramos la información la llevo a una lista
		//System.out.println(nombres);
		List<String> names = nombres.collect(Collectors.toList());
		//Mostrar los resultados en consola
		//System.out.println(names);
		//Declaramos una lista para guardar a nuestros objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		//Creamos una lista para recolectar información filtrada
		List<Persona>filtrada = new ArrayList<Persona>();
		//Añadir elementos a mi lista original
		original.add(new Persona("Jorge","MASCULINO", 37));
		original.add(new Persona("Alicia","FEMENINO", 25));
		original.add(new Persona("César","MASCULINO", 27));
		original.add(new Persona("Mauricio","MASCULINO", 30));
		original.add(new Persona("Guadalupe","FEMENINO", 25));
		original.add(new Persona("Lucina","FEMENINO", 26));
		original.add(new Persona("Raul","MASCULINO", 27));
		original.add(new Persona("Sergio","MASCULINO", 38));
		original.add(new Persona("Gabriela","FEMENINO", 22));
		original.add(new Persona("Rafael","MASCULINO", 24));
		//Visaulizar mi lista original en consola
		//System.out.println(original);
		//REcorrer nuestra lista para ver cada elemento con un ciclo for
//		for(int i=0;i<original.size();i++)
//		{
//		 System.out.println(original.get(i));	
//		}
		//Recorrer o recuperar todos los elementos con el ciclo foreach
//		for(Persona i: original) {
//			System.out.println(i);
//		}
//		
		//Visualizar el ciclo foreach a traves de la lista
		//original.forEach(a->System.out.println(a));
		
		//Si filtraramos a los elementos del género masculino con un ciclo convencional (for each)
//		for(Persona i:original) {
//			if(i.getGenero().contentEquals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//	    Filtrar con el API Stream a las personas de genero femenino
//		filtrada=original.stream()
//				.filter(item->item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		filtrada.forEach(a->System.out.println(a));
//		//otra forma de visualizar todos los elementos de la lista
		//filtrada una a una es con la siguiente línea de instrucción:
//		filtrada.forEach(System.out::println);
	//Ordenar a las personas por edad ascendente
//		filtrada=original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
//		
		//Contar el número de elementos de mi lista
		//System.out.println(original.stream().count());
		//Solicitar una variable booleana si todos los elementos cumplen una condición
//		boolean alguno = original.stream().allMatch(a->a.getEdad()<30);
//		System.out.println(alguno);
		//Retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos
		//en caso que no se encuentren
		Optional<Persona> menorEdad=original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		}
		
		
		
	}


