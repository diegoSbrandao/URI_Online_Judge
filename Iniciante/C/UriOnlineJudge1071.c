#include<stdio.h>

int main(){

        int x = 0, y = 0, soma = 0;
        scanf("%d %d",&x,&y);

        if(x > y ){
            int aux = y;
            y = x;
            x = aux;
        }
        int i =0;
        for(i = x+1; i < y; i++){
            if(i%2!=0){
                soma+=i;
            }
        }
        printf("%d\n",soma);
 return 0;
}
