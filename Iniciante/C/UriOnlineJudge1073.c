#include<stdio.h>
int main(){

        int x = 0, i = 0;
        scanf("%d",&x);

        for(i =1; i <= x; i++){

            if(i%2==0){
                int potencia = i*i;
                printf("%d^2 = %d\n",i,potencia);
            }

        }

 return 0;
}
