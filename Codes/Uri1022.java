import java.util.Scanner;

public class Uri1022 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        System.out.printf("MEDIA = %.1f\n", (((a * 2) + (b * 3) + (c * 5)) / 10));
        s.close();
    }
}