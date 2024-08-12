/*
 * 4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
	minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
	horas.
 */

package com.ciclos;

public class Ciclos4_HIMG {

	public static void main(String[] args) throws InterruptedException {
		// Creación de variables.
		int segundos, minutos, horas;
		
		// Inicialización del ciclo for que hara avanzar la cuenta de segundos hasta completar 60.
		// (60 s = 1 minuto)
		// (60 m = 1 hora)
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					//System.out.println("Son las " + horas + " con " + minutos + " minutos y " + segundos + " segundos");
					System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
					Thread.sleep(1000);
				}
			}
		}

	}

}
