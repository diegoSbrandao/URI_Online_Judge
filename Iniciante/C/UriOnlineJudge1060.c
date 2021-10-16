#include<stdio.h>

int main(){

        int positivos = 0;
        int i =0;

         for(i ; i < 6; i++){
            double numeros = 0;

            scanf("%lf",&numeros);

            if(numeros > 0){
               positivos++;
            }
        }

        printf("%d valores positivos\n",positivos);

 return 0;
}
