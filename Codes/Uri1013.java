// Entre com 3 inteiros, o retorno é o maior deles
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        s.close();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorAC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        
        System.out.println( maiorAC + " eh o maior");         
    }
}
