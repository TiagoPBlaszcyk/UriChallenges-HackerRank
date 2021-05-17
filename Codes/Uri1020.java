//valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dia = s.nextInt();
        s.close();
        int ano = dia / 365;
        dia = dia % 365;
        int mes = dia / 30;
        dia = dia % 30;
        System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + dia + " dia(s)\n");  
    }
}
