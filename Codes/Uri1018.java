
//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
//As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
import java.util.Scanner;

public class Uri1018 {
    public static final float[] cedula = {100, 50, 20, 10, 5, 2, 1};
    public static int contagem = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        s.close();
        System.out.println(valor);
        cedulas(valor, 0);
        // System.out.println();
    }

    public static void cedulas(float valor, int j) {
        if (j < cedula.length) {
            if (valor >= cedula[j]) {
                contagem++;
                cedulas(valor - cedula[j], j);
            } else if (valor < cedula[j]) {
                System.out.printf("%d nota(s) de R$ %.2f\n", contagem, cedula[j]);
                contagem = 0;
                j++;
                cedulas(valor, j);
            }
        }
    }
}
