package Modulo_5_Repetição;
import java.util.*;


public class Atividade15M5 {

    public static double mediaNotas(double nota1, double nota2){
        double media = (nota1 + nota2)/2;
        return media;
    }

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        double nota1, nota2;
        System.out.println("Descubra a media");

        for (int i = 1; i <=3; i++){
            System.out.println("Digite a 1° nota");
            nota1 = inpt.nextDouble();
            System.out.println("---------------------------------------");
            System.out.println("Digite a 2° nota");
            nota2 = inpt.nextDouble();
            System.out.println("---------------------------------------");
            System.out.println("A media do "+i+"° aluno é: "+ mediaNotas(nota1, nota2));
            System.out.println("---------------------------------------");
        }

    }
}
