// Realiza a media de km /l de um altomovel, entre com intero "Km" e real "combustivel/L"
import java.util.Locale;
import java.util.Scanner;
public class Uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double b = s.nextDouble();
        double media = a / b; 
        System.out.printf("%.3f km/l%n", media);
        s.close();
    }
}