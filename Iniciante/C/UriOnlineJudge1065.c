#include<stdio.h>

int main(){


        int pares = 0, i = 0;

        for(i ; i < 5; i++){
            int numeros = 0;
            scanf("%d",&numeros);

            if(numeros%2== 0){
                pares++;
            }
        }

        printf("%d valores pares\n",pares);

 return 0;
}
