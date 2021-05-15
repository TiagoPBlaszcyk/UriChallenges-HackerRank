// Realiza a media ponderada com pesos 2,3,5. 
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double a, b, c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        System.out.printf("MEDIA = %.1f\n", (((a * 2) + (b * 3) + (c * 5)) / 10));
        s.close();
    }
}