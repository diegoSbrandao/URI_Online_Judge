#include <stdio.h>

int main(){


    int n,i;
    scanf("%d",&n);
    float x,y;

    for (i =0; i < n; i++){

        scanf("%f %f",&x,&y);

        if(y==0){
            printf("divisao impossivel\n");
           }
           else{
             printf("%.1f\n",x/y);
           }

    }

    return 0;
}
