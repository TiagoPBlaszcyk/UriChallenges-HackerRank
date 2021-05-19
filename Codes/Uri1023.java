/**
 * Realiza Calculo de Bhaskara: Entrada esperada 3 numeros com ponto flutuante, 
 * saida "R1 = ", "R2 = " ou "Impossivel calcular"
 */

// 10,3 203,0 5,0 \\ 10.0 20.1 5.1   Experimente e.e

import java.util.Scanner;
public class Uri1023 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        if ((a == 0) | (b * b - 4 * a * c < 0)) {
			System.out.println("Impossivel calcular");
		}
        double bascara = Math.sqrt((b * b) - 4 * a * c);
        double r1 = (-b + bascara) / (2 * a);
        double r2 = (-b - bascara) / (2 * a);
        System.out.println(String.format("R1 = %.5f", r1));
        System.out.printf("R2 = %.5f\n", r2);
    }
}



/*
import java.util.Locale;
import java.util.Scanner;
public class Uri1023 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Double a = s.nextDouble();
        Double b = s.nextDouble();
        Double c = s.nextDouble();
        s.close();
        a = a * 100 + 0.05;
        b = b * 100 + 0.05;
        c = c * 100 + 0.05;
        Double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            Double x1, x2;
            x1 = (((-b) + Math.sqrt(delta)) / (2 * a));
            x2 = (((-b) - Math.sqrt(delta)) / (2 * a));
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);   
        }
    }
} */
