package br.com.urionlinejudge;
import java.util.Scanner;

/*

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
segundo o esquema abaixo, da esquerda para a direita.
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para
identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de Entrada
vertebrado
mamifero
onivoro

Exemplos de Saída
homem

Exemplos de Entrada
vertebrado
ave
carnivoro

Exemplos de Saída
aguia

Exemplos de Entrada
invertebrado
anelideo
onivoro

Exemplos de Saída
minhoca

 */

public class UriOnlineJudge1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        String c = "";

        if(a.equalsIgnoreCase("vertebrado")){
            b = sc.nextLine();

            if(b.equalsIgnoreCase("ave")){
                c = sc.nextLine();
                if(c.equalsIgnoreCase("carnivoro")){
                    System.out.print("aguia\n");
                }
                else {
                    System.out.print("pomba\n");
                }
            }

            else if(b.equalsIgnoreCase("mamifero")){
                c = sc.nextLine();
                if(c.equalsIgnoreCase("onivoro")){
                    System.out.print("homem\n");
                }
                else {
                    System.out.print("vaca\n");
                }
            }
        }

        //-----------------------------------------------------------------

        else if(a.equalsIgnoreCase("invertebrado")){
            b = sc.nextLine();

            if(b.equalsIgnoreCase("inseto")){
                c = sc.nextLine();
                if(c.equalsIgnoreCase("hematofago")){
                    System.out.print("pulga\n");
                }
                else {
                    System.out.print("lagarta\n");
                }
            }

            else if(b.equalsIgnoreCase("anelideo")){
                c = sc.nextLine();
                if(c.equalsIgnoreCase("hematofago")){
                    System.out.print("sanguessuga\n");
                }
                else {
                    System.out.print("minhoca\n");
                }
            }
        }

        sc.close();
    }
}













