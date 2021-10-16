#include<stdio.h>

int main(){

        int x = 0, cont = 0;
        scanf("%d",&x);

        while (cont <6){
            if(x%2!=0){
                cont++;
                printf("%d\n",x);
            }
        x++;
        }
 return 0;
}
