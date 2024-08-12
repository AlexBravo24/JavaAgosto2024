//4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
//horas


package ciclos;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ciclos4_IRF {

	public static void main(String[] args) {

		
		// instance objeto LocalDate
		LocalTime objTime = LocalTime.of(00,00,00);
		LocalTime objTimeFuture = LocalTime.of(00,00,00);
		
		// formmater LocalTime 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

		
		// bucle print all time of day 
		for(int i = 0; i < 1440; i++) {
			
			objTimeFuture = objTime.plusSeconds(i);
			System.out.println(objTimeFuture);

			//System.out.println(objTimeFuture.format(formatter));
		}
		


	}

}
