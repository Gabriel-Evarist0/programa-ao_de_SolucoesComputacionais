package Modulo_5;
import java.util.Scanner;

public class Atividade13M5 {

    public static void chamaTeste(String nome, String sexo, int idade){
        if (sexo.equalsIgnoreCase("feminino") == true){
            System.out.println("teste");
        }
    }

    public static String imprimi(){
        Scanner input = new Scanner(System.in);
        String nome,sexo;
        int idade;
        System.out.println("nome:");
        nome = input.nextLine();
        System.out.println("Sexo");
        sexo = input.nextLine();
        System.out.println("Idade");
        idade = input.nextInt();
        return (nome, sexo);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(i<10){
            imprimi();
        }


    }
}
