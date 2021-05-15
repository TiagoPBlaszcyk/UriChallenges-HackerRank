import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int c1,c2;
        int q1,q2;
        Double v1,v2,r;

        //c1 = s.nextInt();
        q1 = s.nextInt();
        v1 = s.nextDouble();
        //c2 = s.nextInt();
        q2 = s.nextInt();
        v2 = s.nextDouble();
        
        r =(q1 * v1) + (q2 * v2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", r);
        s.close();
    }
}
