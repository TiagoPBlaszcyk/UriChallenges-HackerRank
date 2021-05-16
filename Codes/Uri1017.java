// combustivel gasto
import java.util.Scanner;
import java.util.Locale;
public class Uri1017{
	public static void main(String[] args){
        Locale.setDefault(new Locale("en", "US"));
		Scanner s = new Scanner(System.in);
        int horas = s.nextInt();
        int velocidade = s.nextInt();
        System.out.printf("%.3f\n", (horas * velocidade)/12.0);
        s.close();
	}
}