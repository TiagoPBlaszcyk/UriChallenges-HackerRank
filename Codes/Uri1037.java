import java.util.Scanner;
public class Uri1037 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double a = s.nextDouble();
        s.close(); 
        if (a < 0.00 || a > 100.00) {
            System.out.println("Fora de intervalo");
        }else if (a <= 25.00) {
            System.out.println("Intervalo [0,25]");
        }else if (a <= 50.00) {
            System.out.println("Intervalo (25,50]");
        }else if (a <= 100.00) {
            System.out.println("Intervalo (75,100]");
        }
    }
}
