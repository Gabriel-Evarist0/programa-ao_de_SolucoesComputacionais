package Procedimentos_e_Funcoes;
import java.util.*;

public class Atividade2 {

    public static void escolha(int choose, int a, int b){
        switch (choose){
            case 1:
                System.out.println("A soma de "+ a + " + "  + b + " = " + soma(a,b));
                break;
            case 2:
                System.out.println("A subtração de "+ a + " - "  + b + " = " + subtracao(a,b));
                break;
            case 3:
                System.out.println("A multiplicação de "+ a + " x "  + b + " = " + multiplicacao(a,b));
        }

    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int multiplicacao(int a, int b){
        int mult = 0;
        for (int i = 0; i < b;i++){
            mult = mult + a;
        }

        return mult;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Digite 2 numeros inteiros");
        System.out.println("--------------------------");
        System.out.print("Primeiro Numero: ");
        int a = input.nextInt();
        System.out.print("Segundo Numero: ");
        int b = input.nextInt();
        System.out.println("--------------------------");
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("--------------------------");
        int choose = input.nextInt();
        escolha(choose, a, b);
    }

}