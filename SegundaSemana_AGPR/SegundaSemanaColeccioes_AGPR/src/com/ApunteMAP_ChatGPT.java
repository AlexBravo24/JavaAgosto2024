package com;
import java.util.HashMap;
import java.util.Map;

public class ApunteMAP_ChatGPT {
	public static void main(String[] args) {

		/*Mapas (Map)
		¿Qué es un Mapa?
		Definición: Un mapa es una colección de pares clave-valor. 
		Cada clave en el mapa es única y se asocia a un valor. 
		Los mapas no permiten claves duplicadas, pero pueden tener valores duplicados.
		Orden: El orden de los elementos en un mapa no está garantizado 
		(a menos que uses LinkedHashMap para mantener el orden de inserción o TreeMap 
		para mantener el orden natural de las claves).
		Acceso: Accedes a un valor a través de su clave.
		*/
		
		//SINTAXI DE MAPAS
		/*Los mapas en Java se implementan a través de la interfaz Map. 
		 * Las implementaciones más comunes son HashMap, TreeMap, y LinkedHashMap. 
		 * Aquí está la sintaxis básica para crear y usar un mapa:
		 */
		
		//1. IMPORTAR CLASES en la parte superior
//		import java.util.HashMap;
//		import java.util.Map;
		
		//2. CREAR UN MAPA
		//Para crear un mapa, debes especificar el tipo de claves y valores. 
		//Por ejemplo, un mapa con claves de tipo String y valores de tipo Integer:
		Map<String, Integer> mapa = new HashMap<>();
		
		//3. AÑADIR PARES CLAVE-VALOR
		mapa.put("Clave1", 1);
		mapa.put("Clave2", 2);

		//4. ACCEDER A UN VALOR POR CLAVE
		int valor = mapa.get("Clave1"); // Obtiene el valor asociado a "Clave1"
		
		//5. ITERAR SOBRE EL MAPA
		for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
		    System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
		}
		
		//6. VERIFICAR SI UNA CLAVE EXISTE
		boolean contieneClave = mapa.containsKey("Clave1");
		
		//EJEMPLO COMPLETO
		System.out.println(" ");
		System.out.println("EJEMPLO COMPLETO");
		
		 Map<String, Integer> mapa2 = new HashMap<>();
	        mapa2.put("A", 1);
	        mapa2.put("B", 2);
	        mapa2.put("C", 3);
	        
	        System.out.println("Valor de 'B': " + mapa2.get("B")); // Imprime 2
	        
	        for (Map.Entry<String, Integer> entry : mapa2.entrySet()) {
	            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
	        }
	        
	        System.out.println("¿Contiene clave 'A'? " + mapa2.containsKey("A"));
	        
	        System.out.println(" ");
	        System.out.println("RESUMEN DE SINTAXIS");
	        System.out.println("Crear: Map<K, V> mapa = new HashMap<>();\r\n" + 
	        		"Añadir: mapa.put(clave, valor);\r\n" + 
	        		"Acceder: V valor = mapa.get(clave);\r\n" + 
	        		"Iterar: for (Map.Entry<K, V> entry : mapa.entrySet()) {...}\r\n" + 
	        		"Verificar: boolean contieneClave = mapa.containsKey(clave);");
	
	}
}
