import java.util.Scanner;

public class CheckImparRecursivo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(impar(s.nextInt()));
        s.close();
    }
    //Made by Djair
    public static boolean impar (int numb) {
        return numb != 0 ? !impar(--numb) : false; // o.O ? -.- : x.x; FIM!
    }


    // O noob conseguio e.e !!!
    /* public static boolean impar (int numb) {
        if (numb == 1) {
            return true;
        } else if(numb == 0){
            return false;
        } else { 
            return impar(numb - 2);
        }
    } */

    // Reles Mortal
    /* public static boolean impar (int numb) {
        boolean ans = false;
        if (numb > 1) ans = impar(numb - 2);
        else if (numb == 1) ans = true;
        return ans;
    } */

    // Versão papo de coach
    /* public static boolean impar (int numb) {
       if (numb == 0) {
           return false;
       } else {
           return !impar(--numb);
       }
    } */
}
