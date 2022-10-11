package Modulo_5_Repetição;
import java.util.Scanner;

public class Atividade13M5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int idade,sexo;
      int var = 0;

        for (int i = 1; i<=10; i++){
            System.out.println("Digite a idade da " + i +"° pessoa: ");
            idade = input.nextInt();
            System.out.println("Digite o sexo da " + i +"° pessoa: (1- Masculino / 2- Feminino)");
            sexo = input.nextInt();

            if (sexo == 2) {
                if (idade >= 20 && idade <= 40) {
                    var++;
                }
            }
        }
        System.out.print("Numero de mulheres entre 20 e 40 anos é de: "+var);
    }
}
