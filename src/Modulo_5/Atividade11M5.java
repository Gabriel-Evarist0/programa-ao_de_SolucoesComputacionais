package Modulo_5;
import java.util.*;

public class Atividade11M5 {
    public static int potencia(int num1, int num2){
        int i = num1;
        if (num2 != 0) {
            while (num2 > 1) {
                num1 = i * num1;
                num2--;
            }
        }else{
            num1 = 1;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Descubra a potencia de um numero.");
        System.out.print("Digite a base:");
        num1 = input.nextInt();
        System.out.print("Digite o expoente:");
        num2 = input.nextInt();
        System.out.println("A potencia de "+ num1 +" elevado a "+ num2 +" é = "+potencia(num1,num2));

    }
}
