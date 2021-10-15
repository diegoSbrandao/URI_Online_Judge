package br.com.urionlinejudge;

import java.util.Scanner;

public class UriOnlineJudge1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X1 = 0, X2 = 0, delta = 0;

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        delta = Math.pow(B, 2) - 4 * A * C;

        if (delta >= 0 && A != 0) {
            X1 = (-B + Math.sqrt(delta)) / (2 * A);
            X2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", X1);
            System.out.printf("R2 = %.5f\n", X2);
        } else {
            System.out.println("Impossivel calcular");
        }

        sc.close();

    }

}


