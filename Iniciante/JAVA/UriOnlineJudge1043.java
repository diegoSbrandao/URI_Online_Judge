package br.com.urionlinejudge;
import java.util.Scanner;
/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada
6.0 4.0 2.0
Exemplo de Saída
Area = 10.0

Exemplo de Entrada
6.0 4.0 2.1
Exemplo de Saída
Perimetro = 12.1
 */

public class UriOnlineJudge1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        boolean triangulo = false;

        if(b-c < a && a < b + c && a-c < b && b < a + c && a-b < c && c < a + b){
          triangulo = true;
            System.out.println("Perimetro = " + (a+b+c));
        }

       if(!triangulo){
           double area = ((a+b) * c ) / 2;
           System.out.println("Area = " + area);
       }


        sc.close();
    }
}










