#include<stdio.h>

int main(){

        int a = 0, b = 0;
        scanf("%d %d",&a,&b);
        char multi = 's';

        multi = (a%b==0 || b%a==0 ) ? 'S': 'N';

        if(multi=='S'){
        printf("Sao Multiplos\n");
        }
        else{
            printf("Nao sao Multiplos\n");
        }


    return 0;
}
