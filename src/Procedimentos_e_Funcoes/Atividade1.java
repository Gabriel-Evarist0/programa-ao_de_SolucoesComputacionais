package Procedimentos_e_Funcoes;
import java.util.*;
public class Atividade1{


    public static int dobraMeta(int num1)
    {
        return num1*2;
    }
    public static int achaMaior(int num1,int num2){
        return Math.max(num1,num2);
    }

    public static double mediaAr(int num1, int num2, int num3){
        double media = (num1+num2+num3)/3;
        return media;
    }

    public static int achaFatorial(int numFat){
        for (int i = numFat - 1; i>=1; i--){
            numFat = numFat*i;
        }
        return numFat;
    }

    public static int somaDeMuitos(int numMuito){
        int soma = 0;

        for (int i = 0; i <= numMuito; i++){
            soma = soma + i;
        }
        return soma;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Escolha uma das Funções:");
        System.out.println("1 - Dobrar um número");
        System.out.println("2 - Achar o maior entre 2 números");
        System.out.println("3 - Achar a media entre 3 números");
        System.out.println("4 - Achar fatorial de um número");
        System.out.println("5 - Somar todos os numeros entre 0 e x Número");
        System.out.println("----------------------------");
        System.out.print("Choose: ");
        int choose = input.nextInt();

        switch (choose){
            case 1:
                System.out.println("Informe um número para descobrir seu dobro");
                int numD = input.nextInt();
                System.out.println("O dobro de " + numD + " é " + dobraMeta(numD));
                break;

            case 2:
                System.out.println("Informe 2 números para achar o maior entre eles");
                int numMaior = input.nextInt();
                int numMaior2 = input.nextInt();
                System.out.println("O maior numero entre " + numMaior + " e " +
                        numMaior2 + " é " + achaMaior(numMaior,numMaior2));
                break;

            case 3:
                System.out.println("Informe 3 números para achar a média aritimetica"
                        + " dos mesmos");
                int numMed1 = input.nextInt();
                int numMed2 = input.nextInt();
                int numMed3 = input.nextInt();
                System.out.println("A media dos 3 numeros é " +
                        mediaAr(numMed1,numMed2,numMed3));
                break;

            case 4:
                System.out.println("Digite um número para descobrir");
                int numFatorial = input.nextInt();
                System.out.println("O resultado fatorial de " + numFatorial +
                        " é " + achaFatorial(numFatorial));
                break;

            case 5:
                System.out.println("Digite um número e descubra a soma de 0 até ele");
                int numSomaMt = input.nextInt();
                System.out.println("A soma é igual a " + somaDeMuitos(numSomaMt));
                break;
        }
    }

}