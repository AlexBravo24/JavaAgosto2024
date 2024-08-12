package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream- Funcionalidad a partir de Java 8
		//que nos permite gestionar de forma más rápida e iterativa la información
		//que tengamos en nuestras colecciones de datos
		
		//Las coleccioens se vuelven un flujo de datos a partir 
		//del cual podemos solicitar la información que neceistamos
		
		//Ejemplo de el uso de Stream
		
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")//ponemos punto
				.filter(item -> item.contains("i"));
		
		//Una vex filttamos la información, la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola
		System.out.println(names);
		
		//Declaramos una lista par aguardar nuestros objetos Persona
		
		List<Persona> original = new ArrayList<Persona>();
		
		//creamos una lista para recolectar la información filtrada
		List<Persona> filtrada= new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		original.add(new Persona("Jorge", "Masculino", 37));
		original.add(new Persona("Alicia", "Femenino", 25));
		original.add(new Persona("César", "Masculino", 27));
		original.add(new Persona("Mauricio", "Masculino", 30));
		original.add(new Persona("Guadalupe", "Femenino", 25));
		original.add(new Persona("Lucina", "Femenino", 26));
		original.add(new Persona("Raul", "Masculino", 27));
		original.add(new Persona("Sergio", "Masculino", 38));
		original.add(new Persona("Gabriela", "Femenino", 22));
		original.add(new Persona("Rafael", "Masculino", 24));
		
		//Imprimir la lista original
		System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con un ciclo for
		for (int i = 0; i < original.size(); i++) {
			System.out.println(original.get(i));
		}
		
		//Recuperar todos los elementos con el ciclo for each
		for (Persona i: original) {
			System.out.println(i);
		}
		
		//forEach pero ahora a través de nuestra lista
		System.out.println("MÉTODO FOR EACH A TRAVÉS DE NUESTRA LISTA");
		original.forEach(a -> System.out.println(a));
		
		//Si filtráramos a los elementos del género masculino
		//con un ciclo convencional:
		
		System.out.println("LISTA CON GÉNERO MASCULINO");
		for (Persona i:original) {
			if (i.getGenero().equals("Masculino")) {
				filtrada.add(i);
				System.out.println(i);
			}
		}
		
		//Filtrar con el API Stream a las personas del género femenino
		filtrada=original.stream()
				.filter(item -> item.getGenero().contentEquals("Femenino"))
				.collect(Collectors.toList());
		System.out.println("LISTA GÉNERO FEMENINO");
		filtrada.forEach(System.out::println);
		
		
		//Ordenar a las personas por edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		System.out.println("EDADES EN ORDEN ASCENDENTE");
		filtrada.forEach(System.out::println);
		
		//Contar el número de elementos de mi lista
		System.out.println("NÚMERO DE ELEMENTOS EN LA LISTA");
		System.out.println(original.stream().count());

		//Solicitar una variable booleana si algún elemento o todos los elementos
		//cumplean alguna condicion
		
		System.out.println("ALGUNO TIENE MENOR DE 30 AÑOS?");
		boolean alguno= original.stream().anyMatch(a-> a.getEdad()<30);
		System.out.println(alguno);
		
		//Retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos,
		//en caso de que no se encuentren
		
		System.out.println("¿QUIÉN TIENE MENOR EDAD?");
		Optional<Persona>menorEdad=original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
