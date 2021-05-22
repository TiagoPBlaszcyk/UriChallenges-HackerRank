import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aux; 
        int[] quantidade = new int[3];
        int[] resposta = new int[3];
         
        for (int x = 0; x < quantidade.length; x++) {
            quantidade[x] = s.nextInt();
            resposta[x] = quantidade[x];
        }
        s.close();

        for (int i = 0; i < quantidade.length; i++) {
            for (int j = i; j < quantidade.length; j++) {
                if (quantidade[i] > quantidade[j]) {
                    aux = quantidade[i];
                    quantidade[i] = quantidade[j];
                    quantidade[j] = aux;
                }
            }
        }

        for (int z = 0; z < quantidade.length; z++) {
                    System.out.println(quantidade[z]);
        }
        System.out.println();
        for (int z = 0; z < resposta.length; z++) {
                    System.out.println(resposta[z]);
        }
    }          
}