#include <stdio.h>
#include <stdlib.h>

int main(){

        int codigo = 0, quantidade = 0;
        double total =0;

        scanf("%d %d",&codigo,&quantidade);

        if(codigo==1){
            total = quantidade * 4;
        }
        else if(codigo==2){
            total = quantidade * 4.50;
        }
        else if(codigo==3){
            total = quantidade * 5;
        }
        else if(codigo==4){
            total = quantidade * 2;
        }
        else if(codigo==5){
            total = quantidade * 1.50;
        }

        printf("Total: R$ %.2lf\n",total);

    return 0;

}
