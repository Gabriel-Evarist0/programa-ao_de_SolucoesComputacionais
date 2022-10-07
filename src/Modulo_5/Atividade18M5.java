package Modulo_5;
import java.util.*;

public class Atividade18M5 {

    public static double calculaMedia(double totalTemp){
        double media = totalTemp/48;
        return media;
    }

    public static double contaMtGrande(int t){
        double rad = 0.08721 * t;
        double T = 19.06 + 0.211 *  (Math.cos(rad) + (-5.51*(Math.sin(rad))));
        return T;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp,maxTemp = 0,minTemp = 0,totalTemp = 0;
        int hrsMais = 0, hrsMenos = 0;
        for(int t = 0; t <= 48; t++){
            temp = contaMtGrande(t);
            totalTemp = totalTemp + temp;
            if (temp < minTemp || minTemp == 0){
                minTemp = temp;
            } else if (temp > maxTemp){
                maxTemp = temp;
            }
            if(temp > 19){
                hrsMais++;
            } else if(temp < 16) {
                hrsMenos++;
            }

        }
        System.out.printf("%nSobre a temperatura nas primeiras 48 horas de BH temos:%n");
        System.out.println("--------------------------------------------------");
        System.out.printf("Media da temperatura: %.2f %n",calculaMedia(totalTemp));
        System.out.println("--------------------------------------------------");
        System.out.printf("Maior temperatura registrada: %.2f %n", maxTemp);
        System.out.println("--------------------------------------------------");
        System.out.printf("Menor temperatura registrada: %.2f %n", minTemp);
        System.out.println("--------------------------------------------------");
        System.out.println("Horas com temperatura maior que 19: " + hrsMais);
        System.out.println("--------------------------------------------------");
        System.out.println("Horas com temperatura menor que 16: " + hrsMenos);
        System.out.println("--------------------------------------------------");
    }

}
