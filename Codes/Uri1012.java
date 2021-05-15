/* Entre com valores A, B e C. Em seguida, mostra:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double a,b,c;
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (a * c / 2.0));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * (c * c)));
        System.out.printf("TRAPEZIO: %.3f\n", ((c * (a + b)) / 2));
        System.out.printf("QUADRADO: %.3f\n", (b * b));
        System.out.printf("RETANGULO: %.3f\n", (a * b));
        s.close();

    }

}
