package Modulo_5;
import java.util.*;

class Atividade12M5 {

    public static void achaImpar(int numLimit){
        System.out.println("Numeros Impares até " + numLimit);
        for (int i = 0; i <= numLimit; i++){
            if (i %2 != 0){
                System.out.print("|" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Descubra os números impares de 0 até o limite que desejar");
        System.out.print("Digite até qual número você deseja: ");
        int numLimit = input.nextInt();
        achaImpar(numLimit);
    }
}