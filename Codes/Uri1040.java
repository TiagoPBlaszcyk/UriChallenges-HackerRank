import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;
        System.out.println("Media: " + df.format(media));
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
            System.out.println("Aluno em exame.");
            double exame = s.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(media));
        } else {
            System.out.println("Aluno reprovado.");
        }
        s.close();
    }
}
