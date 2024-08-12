package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * API Stream - Funcionalidad a partir de java 8 
		 * que nos va a permitir gestinar de una forma mas rapida e 
		 * imperactiva la informacion que tengamos en nuestras colleciones de datos 
		 * las colleciones se vuelven un flujo de datos a partir 
		 * de la cual podemos solicitar informacion que necesitemos  
 		 * */
		
		// EJEMPLO DE USO DE STREAM
		
		Stream<String> nombres = Stream.of("juan","roger",
				"Elizabeth","Daniela").filter(x->x.contains("i")); 
		
		// una vez se filtra la info, se lleva a una lista  o se convierte 
		List<String> names = nombres.collect(Collectors.toList());
		
		//System.out.println(names); 
		
		// declramos una lista y despues se convierte a un stream 
		
		// declaramos una lista para guardar nuestros objetos persona 
		List<Persona> original = new ArrayList<Persona>(); 
		
		// crear una lista para recollectar informacion filtrada 
		List<Persona> filtrada = new ArrayList<Persona>(); 
		
		// add items a lista original 
		original.add(new Persona("Irving","MASCULINO","26"));
		original.add(new Persona("Daniela","FEMENINO","22"));
		original.add(new Persona("Joanha","FEMENINO","26"));
		original.add(new Persona("Elizabeth","FEMENINO","32"));
		original.add(new Persona("Julia","FEMENINO","26"));
		original.add(new Persona("Aleyda","FEMENINO","26"));
		original.add(new Persona("Dania","FEMENINO","26"));
		
		//System.out.println(original);
		
		// foreach
		for (Persona iterador:original) {
			
			if(iterador.getGenero().contentEquals("MASCULINO")) {
				System.out.println(iterador);
			}
			else {
				System.out.println(iterador);
			}
			
		}
		
		// imprimir mismo foraech a partir de la lista 
		//original.forEach(x->System.out.println(x));
		
		filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList()); 
		
		filtrada.forEach(System.out::println);
		
		boolean alguno = original.stream().anyMatch(a -> a.getNombre() == "Irving"); 
		System.out.println(alguno);
		
		
		

		
		

		

	}

}
