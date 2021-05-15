import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Double a,b;
        
        a = s.nextDouble();
        b = 4 * 3.14159 * Math.pow(a, 3) / 3;

        System.out.printf("VOLUME = %.3f\n", b);
        s.close();

    }

}