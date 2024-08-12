package ciclos;

public class Ciclos5_FIPS {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte
        double monto = 1000.00;

        // Tasa de interés mensual (2%)
        double tasaInteresMensual = 0.02;

        // Número de meses (1 año)
        int numeroDeMeses = 12;

        // Calcular el monto final después de un año
        for (int mes = 1; mes <= numeroDeMeses; mes++) {
            // Aplicar el interés al monto actual
            monto += monto * tasaInteresMensual;
        }

        // Imprimir el monto final
        System.out.printf("El monto total después de un año es: $%.2f\n", monto);
    }
}