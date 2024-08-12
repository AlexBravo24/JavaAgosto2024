package ciclos;

public class Ciclos4_1_JABR {

	public static void main(String[] args) throws InterruptedException {
		//Ejercicio que simule las horas de un reloj
		
		for(int horas=0;horas<24;horas++) {
			for(int minutos=0;minutos<60;minutos++) {
				for(int segundos=0;segundos<60;segundos++){
					System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
					Thread.sleep(1000);
				}
			}
		}
	}
}
