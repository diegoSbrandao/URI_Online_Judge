package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1134
Tipo de Combustível
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido
 (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
 Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
  deve ser solicitado um novo código (até que seja válido).
   O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível, conforme exemplo.

Exemplo de Entrada
8
1
7
2
2
4
Exemplo de Saída
MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0

 */
public class UriOnlineJudge1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0, alcool = 0, gasolina = 0, diesel = 0;

        while (answer != 4) {

            answer = sc.nextInt();
            switch (answer) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO\n" +
                            "Alcool: " + alcool + "\n" +
                            "Gasolina: " + gasolina + "\n" +
                            "Diesel: " + diesel);
                    break;
            }

        }

    }
}