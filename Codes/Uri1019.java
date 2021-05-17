// Quantidade de inteiros representando segundos, trasnformado em h:min:sec
import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        s.close();
        int horas = time / 3600;
        time = time % 3600;
        int min = time / 60;
        time = time % 60;
        int seg = time;
        System.out.println(horas + ":" + min + ":" + seg);
    }
}
