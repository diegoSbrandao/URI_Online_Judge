#include <stdio.h>
#include <stdlib.h>

void somaImpar(int x, int y);

int main(){

       int n = 0, i;
       scanf("%d",&n);
       int x=0, y=0;

        for (i = 0; i < n; i++) {
            int aux = 0;

            scanf("%d",&x);
            scanf("%d",&y);

            if (x > y) {
                aux = y;
                y = x;
                x = aux;
            }
            somaImpar(x, y);
        }
           return 0;
}

void somaImpar(int x, int y) {
        x = x+1;
        int soma = 0,i;
        for (i = x; i < y; i++) {
            if (i % 2 != 0) {
                soma+=i;
            }
        }
        printf("%d\n",soma);
}








