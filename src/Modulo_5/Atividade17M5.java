package Modulo_5;

import java.util.Scanner;

public class Atividade17M5 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int idade,qnt90 = 0;
        double peso,pesoTotal = 0, media ;
        for(int i = 1; i <= 7; i++){
            System.out.println("Digite o Peso da " + i + "pessoa:");
            peso = inpt.nextDouble();
            System.out.println("Digite a Idade da " + i + "pessoa: ");
            idade = inpt.nextInt();
            if(peso >= 90){
                qnt90++;
            }
            pesoTotal = pesoTotal + peso;

        }
        media = pesoTotal/7;
        System.out.printf("Media de peso: %.2f %n" , media);
        System.out.printf("Numero de pessoas com + de 90kg: " , qnt90);
    }
}

