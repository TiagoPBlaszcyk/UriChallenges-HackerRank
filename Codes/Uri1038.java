import java.util.Scanner;
public class Uri1038 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close(); 
        Double[] aux = {0.00, 4.00, 4.50, 5.00, 2.00, 1.50};
        //System.out.printf("Total: R$ %.2f\n", aux[a]*b);
        System.out.println(String.format("Total: R$ %.2f\n", aux[a]*b));
    }
}


/* 
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int codigo = s.nextInt();
		int quantia = s.nextInt();
        s.close();
		double total;
		switch (codigo) {
			case 1:	total = quantia * 4.00; break;
			case 2: total = quantia * 4.50; break;
			case 3: total = quantia * 5.00; break;
			case 4: total = quantia * 2.00; break;
			case 5: total = quantia * 1.50; break;
			default: total = 0;
		}
		System.out.println(String.format("Total: R$ %.2f", total));
	}
} */