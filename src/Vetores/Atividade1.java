package Vetores;
import java.util.*;
public class Atividade1 {
    public static int somaVetor(int num[]){
            int soma = 0;
            for(int i = 0; i < num.length; i++){
                soma = soma + num[i];
            }
            return soma;
        }

        public static int mediaVetor(int num[]){
            int soma = 0;
            int media;
            for(int i = 0; i < num.length; i++){
                soma = soma + num[i];
            }
            media = soma / num.length;
            return media;
        }

        public static int parVetor(int num[]){
            int par = 0;
            for(int i = 0; i < num.length; i++){
                if (i % 2 == 0){
                    par++;
                }
            }
            return par;
        }

        public static void inverso(int num[]){
            int tamanho = num.length - 1;
            System.out.println("Print do vetor ao inverso");
            for (int i = tamanho; i >= 0; i--){
                System.out.printf("%d | ", num[i]);
            }
        }
        public static void main(String[] args) {
            // Declaração do vetor
            int[] num = new int[10];
            Scanner reader = new Scanner(System.in);
            int impar = 10 - parVetor(num);
            System.out.println("Por favor, informe números inteiros");
            // Estrutura de repetição para realizar a leitura dos dados
            for (int i = 0; i < 10; i++) {
                System.out.printf("\nNúmero %d:", i + 1);
                num[i] = reader.nextInt();
            }
            System.out.println("\nFim da leitura, iniciando a impressão.\n");

            // Estrutura de repetição para realizar a impressão dos dados
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d, ", num[i]);
            }
            System.out.println("\nA soma dos valores é: "+somaVetor(num));
            System.out.println("A media dos valores é: " + mediaVetor(num));
            System.out.println("N° de números pares: " + parVetor(num));
            System.out.println("N° de números impares: " + impar);
            inverso(num);

        }
    }

