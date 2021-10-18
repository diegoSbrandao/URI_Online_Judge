#include<stdio.h>
int main()
{
    int N = 0, X = 0, i = 0;

    scanf("%d",&N);


    for(i; i < N ; i++) {

        scanf("%d", &X);

        if (!X) {
            printf("NULL\n");
        }

        if (X%2 == 0 && X!=0){

            if (X > 0) {
                printf("EVEN POSITIVE\n");
            }
            else{
                printf("EVEN NEGATIVE\n");
            }
        }

        if (X%2 != 0 && X!=0){

            if (X > 0){
                printf("ODD POSITIVE\n");
            }
            else{
                printf("ODD NEGATIVE\n");
            }
        }

    }
    return 0;
}
