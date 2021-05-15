// Calcula salario de trabalhadores de acordo com carga horaria e valor pago por hora
// Entre com  Codigo do trabalhador, quantidade de horas, valor de cada hora
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