// distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
import java.util.Scanner;
public class Uri1016 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        int qtd = (60 * a) / 30;
        System.out.println(qtd + " minutos"); 
    }
}