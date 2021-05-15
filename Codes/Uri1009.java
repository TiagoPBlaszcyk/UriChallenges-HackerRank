import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //String a;
        Double b,c,x;
        //a = s.nextLine();
        b = s.nextDouble();
        c = s.nextDouble();
    
        x = 0.15 * c + b;

        System.out.printf("TOTAL = R$ %.2f\n", (x));

        s.close();
    }
}