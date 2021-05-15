import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        Double c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextDouble();

        System.out.println("NUMBER = " + a );
        System.out.printf("SALARY = U$ %.2f\n", (b * c));

        s.close();
    }
}