package ciclos;

public class Ciclos4_FIPS {

	public static void main(String[] args) {
		//CICLOS ANIDADOS
		
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas

        // Bucle para las horas (de 0 a 23)
        for (int hora = 0; hora < 24; hora++) {
            // Bucle para los minutos (de 0 a 59)
            for (int minuto = 0; minuto < 60; minuto++) {
                // Bucle para los segundos (de 0 a 59)
                for (int segundo = 0; segundo < 60; segundo++) {
                    // Imprimir la hora, minutos y segundos en formato HH:MM:SS
                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo); //"%02d:%02d:%02d\n" -- MANDA A IMPRIMIR DIFERENE EN LA CONSOLA "printf"
                }
            }
        }
    }
}

