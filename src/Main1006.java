import java.util.Scanner;

public class Main1006 {
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