package com;

public class Principal {

	public static void main(String[] args) {
		 
		// crear objetos pequeños, que son atributos del mas grande, (clase laptop)

		
		Memoria Kingston = new Memoria("Kingston","B4","8GB"); 
		Procesador Intel = new Procesador("Intel","i5 8300h","2.6ghz"); 
		Almacenanmiento Adata = new Almacenanmiento("Adata","v4",480); 
		
		// print laptop 
		Laptop dell = new Laptop("dell","latitude 5420","plata",Kingston,Intel,Adata); 
		//System.out.println(dell);
		
		
		// parameters Celular
		Battery Battery = new Battery("1000mAh","8h","2h"); 
		Procesador qualcom = new Procesador("qualcom","wg","1.6ghz");
		Camara camara = new Camara("2Mp","1","2.2f"); 
		
		// print 
		Celular sonyEricsson = new Celular("Sony","W580i","black",camara,Battery,qualcom);
		System.out.println(sonyEricsson);
		

		
		

		
	}

}
