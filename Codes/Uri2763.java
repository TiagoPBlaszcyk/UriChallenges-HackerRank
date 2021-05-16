
// CPF 320.025.102-01 filtrando somente numeros 
import java.util.Scanner;
import java.util.Locale;

public class Uri2763 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner s = new Scanner(System.in);
        String cpf = s.nextLine();
        s.close();
        for (int i = 1; i <= cpf.length(); i++) {
            if (i % 4 != 0) {
                System.out.print(cpf.charAt(i - 1));
            } else {
                System.out.println();
            }
        }
        System.out.println();
    }
}