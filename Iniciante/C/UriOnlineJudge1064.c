#include<stdio.h>

int main(){

        int positivos = 0,  i =0;
        double somaPositivos = 0;


         for(i ; i < 6; i++){
            double numeros = 0;

            scanf("%lf",&numeros);

            if(numeros > 0){
               positivos++;
               somaPositivos += numeros;
            }
        }

        double media = somaPositivos / positivos;

        printf("%d valores positivos\n",positivos);
        printf("%.1lf\n", media);

 return 0;
}
