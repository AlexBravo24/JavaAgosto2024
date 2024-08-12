package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la programación orientada a objetos solo debe existir una clase
		// con el metodo main que es la que ejecutara todo el programa o proyecto.
		
		// Vamos a crear un nuevo objeto Persona.
		Persona humberto = new Persona();
		
		// Vamos a crear a una nueva persona con sus atributos iniciados.
		Persona persona = new Persona("Hugo", 23, "Masculino");
		
		// Vamos a asignarle nombre y demás valores a nuestro objeto 
		// llamdo humberto.
		humberto.setNombre("Humbero");
		humberto.setGenero("Masculino");
		
		// Probando un método get para devolver el valor del nombre de una persona.
		System.out.println(persona.getNombre());
		
		// Veamos que ocurre si quiero mandar a imprimir un objeto completo en consola.
		System.out.println(persona);
		System.out.println(humberto);
		
		System.out.println(" "); // Salto de linea para separar los ejercicios.
		
		
		// Creación de los objetos de la clase Superheroe.
		Superheroe ironMan = new Superheroe("Iron Man", 40, "Masculino", "Vuelo supersonico");
		Superheroe batman = new Superheroe();
		batman.setNombre("Batman");
		System.out.println("-----Clase Superheroe-----\n");
		System.out.println(ironMan);
		System.out.println(batman);
		
		System.out.println(" "); // Salto de linea para separar los ejercicios.
		
		// Creación de los objetos de la clase Arbol.
		Arboles naranjo = new Arboles("Naranjo", 1.95, "naranja");
		Arboles manzano = new Arboles();
		manzano.setFruto("manzana");
		System.out.println("-----Clase Arboles-----\n");
		System.out.println(naranjo);
		System.out.println(manzano);
		
		System.out.println(" "); // Salto de linea para separar los ejercicios.
		
		// Creación de la clase Medicamentos.
		Medicamentos jardiance = new Medicamentos("Jardiance", "Metformina", 500, "Tabletas");
		Medicamentos afazol = new Medicamentos();
		afazol.setPincipioActivo("Nafazolina");
		System.out.println("-----Clase Medicamentos-----\n");
		System.out.println(jardiance);
		System.out.println(afazol);
		
		

	}

}
