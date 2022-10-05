package Modulo_5;
import java.util.*;

public class Atividade10M5 {

    public static int fatorial(int x){
        int i = x;
        while (x > 1){
            i = i *(x-1);
            x--;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Descubra o fatorial de um numero");
        System.out.print("Digite o numero:");
        int x = input.nextInt();
        System.out.println("Fatorial de " + x + " é = " + fatorial(x));
    }
}
