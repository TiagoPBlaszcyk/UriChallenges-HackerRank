//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
//As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

/* 550 cedula
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00 */

import java.util.Scanner;

public class VersaoDiscord {

    public static final int[] cedula = {100, 50, 20, 10, 5, 2, 1};
    public static int contagem = 0;
    public static int numerodecedula = 0;

    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        s.close();  
        System.out.println(valor);
        System.out.println("Numero de cedulas " + (cedulas(valor, 0)));
        numerodecedula = 0;
        System.out.println();
    }
    public static int cedulas (int valor, int j) { 
        if (j < cedula.length) {
            if(valor >= cedula[j]){
                contagem++;
                cedulas(valor - cedula[j], j);
            }else if (valor < cedula[j]) {
                numerodecedula += contagem;
                System.out.println(contagem + " nota(s) de R$ " + cedula[j]);
                contagem = 0;
                j++;
                cedulas(valor, j);
            }
        }
        return numerodecedula;
    }
}
