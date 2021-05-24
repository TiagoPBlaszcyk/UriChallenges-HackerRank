// "Perimetro = "
// "Area = "
// 6,0 4,0 2,0

import java.util.Scanner;

public class Uri1043 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble(); 
        s.close();   
        if ((a < b + c) && (b < a + c) && (c < b + a)) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}