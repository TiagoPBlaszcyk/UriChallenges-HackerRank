// Mesma sequencia do 1018 so que agora com moedas
/* NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01 */
// Deste modo o site não aceita, não consegui encontrar o que seria. Vai no bracal copiando do site a formatação x.x
import java.util.Locale;
import java.util.Scanner;
public class Uri1021 {
    public static final Double[] cedula = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Double valor = s.nextDouble();
        int aux = 0;
        s.close();
        Locale.setDefault(Locale.US);
        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            aux = (int) (valor / cedula[i]);
            System.out.printf("%d nota(s) de R$ %.2f\n", aux, cedula[i]);
            valor = valor % cedula[i];
        }
        System.out.println("MOEDAS:");
        for (int j = 6; j < cedula.length; j++) {
            aux = (int) (valor / cedula[j]);
            System.out.printf("%d moeda(s) de R$ %.2f\n", aux, cedula[j]);
            valor = valor % cedula[j];
        }    
    }
}

/* import java.util.Scanner;
public class Uri1021 {
    public static void main(String[] args) {
        int aux = 0;
        Scanner s = new Scanner(System.in);
        Double valor = s.nextDouble();
        s.close();
        
        System.out.println("NOTAS:");
     
            aux = (int) (valor / 100);
            System.out.println(aux + " nota(s) de R$ 100.00");
            valor = valor % 100;

            aux = (int) (valor / 50);
            System.out.println(aux + " nota(s) de R$ 50.00");
            valor = valor % 50;

            aux = (int) (valor / 20);
            System.out.println(aux + " nota(s) de R$ 20.00");
            valor = valor % 20;

            aux = (int) (valor / 10);
            System.out.println(aux + " nota(s) de R$ 10.00");
            valor = valor % 10;

            aux = (int) (valor / 5);
            System.out.println(aux + " nota(s) de R$ 5.00");
            valor = valor % 5;

            aux = (int) (valor / 2);
            System.out.println(aux + " nota(s) de R$ 2.00");
            valor = valor % 2;
       
        System.out.println("MOEDAS:");
      
            aux = (int) (valor / 1.00);
            System.out.println(aux + " moeda(s) de R$ 1.00");
            valor = valor % 1.00;

            aux = (int) (valor / 0.50);
            System.out.println(aux + " moeda(s) de R$ 0.50");
            valor = valor % 0.50;

            aux = (int) (valor / 0.25);
            System.out.println(aux + " moeda(s) de R$ 0.25");
            valor = valor % 0.25;

            aux = (int) (valor / 0.10);
            System.out.println(aux + " moeda(s) de R$ 0.10");
            valor = valor % 0.10;

            aux = (int) (valor / 0.05);
            System.out.println(aux + " moeda(s) de R$ 0.05");
            valor = valor % 0.05;

            aux = (int) (valor / 0.01);
            System.out.println(aux + " moeda(s) de R$ 0.01");
            valor = valor % 0.01;
    }
}

 */