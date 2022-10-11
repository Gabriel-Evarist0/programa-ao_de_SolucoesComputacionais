package Modulo_5_Repetição;

import java.util.Scanner;

public class Atividade16M5 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        double nota, notaMaior = 0, notaMenor = 0;
        System.out.println("Descubra a maior e a menor nota entre 5 alunos ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("nota do " + i + "° aluno");
            nota = inpt.nextDouble();
            System.out.println("---------------------------------------");
            if(nota < notaMenor || notaMenor == 0){
                notaMenor = nota;
            }else if(nota > notaMaior){
                notaMaior = nota;
            }
        }
        System.out.println("Maior nota: " + notaMaior);
        System.out.println("Menor nota: " + notaMenor);
    }
}
