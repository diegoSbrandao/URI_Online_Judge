#include <stdio.h>
#include<stdlib.h>
int main(){

        int n,quantia,somaC=0, somaR=0, somaS=0,i;
        double total, perC, perR, perS;
        char tipo;

        scanf("%d",&n);

        for(i =0; i < n; i++){

        scanf("%d %c",&quantia,&tipo);

            if (tipo == 'c' || tipo == 'C'){
                somaC = somaC + quantia;
            }
            else if  (tipo == 'r' || tipo == 'R'){
                somaR = somaR + quantia;
            }
            else if  (tipo == 's' || tipo == 'S'){
                somaS = somaS + quantia;
            }

        }

        total = somaC + somaR + somaS;
        perC = somaC * 100 / total;
        perR = somaR * 100 / total;
        perS = somaS * 100 / total;

        printf("Total: %.0f cobaias\n",total);
        printf("Total de coelhos: %d\n",somaC);
        printf("Total de ratos: %d\n",somaR);
        printf("Total de sapos: %d\n",somaS);
        printf("Percentual de coelhos: %.2f %%\n",perC);
        printf("Percentual de ratos: %.2f %%\n",perR);
        printf("Percentual de sapos: %.2f %%\n",perS);

    return 0;
}
