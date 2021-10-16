#include<stdio.h>

int main(){

        int pares = 0, impar = 0, positivo = 0, negativo = 0, i = 0;

        for ( i ; i < 5; i++) {
            int numeros = 0;
            scanf("%d",&numeros);

            if (numeros % 2 == 0) {
                pares++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            } else {
                impar++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            }
        }

        printf("%d valor(es) par(es)\n",pares);
        printf("%d valor(es) impar(es)\n",impar);
        printf("%d valor(es) positivo(s)\n",positivo);
        printf("%d valor(es) negativo(s)\n",negativo);

 return 0;
}
