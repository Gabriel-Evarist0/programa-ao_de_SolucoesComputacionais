package Modulo_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade19M5 {

    public static double calculaVt(double v0, double g, double t){
        double vt = v0 - (g*t);
        return vt;
    }
    public static double calculaHt(double v0, double t, double g){
        double vh = (v0*t)-((g*Math.pow(t,2))/2);
        return vh;
    }



        public static void main(String[] args) {
            DecimalFormat df = new DecimalFormat("#0.00");
            Scanner inpt = new Scanner(System.in);
            double v0,g,t = 0;
            System.out.println("Simulação do arremeço de uma bola no planeta terra");
            System.out.println("Digite a velocidade inical do arremesso (m/s)");
            v0 = inpt.nextDouble();
            System.out.println("t (s) |  h(t) | v(t) (m/s)");
            while(t < 2.1){
                System.out.print(df.format(t));
                System.out.printf(" |  %.2f ", (calculaHt(v0, t, 9.807)));
                System.out.printf(" |  %.2f %n" ,(calculaVt(v0,9.807,t)));
                t = t + 0.1;
            }

        }

}
