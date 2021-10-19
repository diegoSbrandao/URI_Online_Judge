#include <stdio.h>
#include<stdlib.h>

int main(){

        int i=1, j=7, contador = 0;

        while (contador < 15) {

        printf("I=%d J=%d\n",i,j);
            j = j - 1;

            if(j<5){
                i = i + 2;
                j = 7;
            }
         contador = contador + 1;
	}

    return 0;
}
