package com;

public class Principal {

	public static void main(String[] args) {
		
		perro logan = new perro("cafe","2 años","50cm","pastor Aleman","logan"); 
		
		System.out.println(logan);
		logan.domir();
		logan.ladrar();
		
		
		gato mishi = new gato("blanco","6 meses " ,"30 cm","Gato siamés","mishi"); 
		
		System.out.println(mishi);
		mishi.arañar();
		mishi.domir();
		mishi.tomarLeche();
		
	
		
		


	}

}
