package Modulo_5;

import java.util.*;
public class Atividade9M5 {

    public static void main(String[] args) {
        Scanner leInput = new Scanner (System.in);
        int i, numero;
        int numMaior = 0;
        int numMenor = 0;
        //Interface
        System.out.println("Este programa identifica o maior e o menor numero dentro de 10 numeros");
        System.out.println("Digite os 10 numeros");
        //Loop
        for (i = 1; i<=10; i++){
            System.out.println("Digite o " + i + "° numero");
            numero = leInput.nextInt();
            //Confere Num Menor1
            if (numMenor == 0){
                numMenor = numero;
            }
            //Confere Numero maior
            else if (numero > numMaior){
                numMaior = numero;
            }
            //Confere Numero menor

            else if (numero < numMenor){
                numMenor = numero;
            }

        }
        System.out.println("Numero menor: " + numMenor);
        System.out.println("Numero maior: " + numMaior);
    }
}