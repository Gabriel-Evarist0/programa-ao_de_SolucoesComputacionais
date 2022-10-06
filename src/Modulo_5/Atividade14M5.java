package Modulo_5;

import java.util.Scanner;

public class Atividade14M5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sexo;
        double peso;
        int varM = 0, varF = 0;

        for (int i = 1; i<=5; i++){
            System.out.println("Digite o peso da " + i +"° pessoa: ");
            peso = input.nextDouble();
            System.out.println("Digite o sexo da " + i +"° pessoa: (1- Masculino / 2- Feminino)");
            sexo = input.nextInt();

            if (sexo == 1){
                if (peso >= 60 && peso <= 80){
                    varM++;
                }
            }
            else{
                if(peso >=50 && peso <= 70){
                    varF++;
                }
            }
        }
        System.out.print("Numero de homens pesando entre 60 e 80 kg é de: "+varM);
        System.out.println("Numero de mulheres pesando entre 50 e 70 kg é de: "+varF);
    }
}
