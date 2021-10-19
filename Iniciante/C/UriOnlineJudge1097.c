#include <stdio.h>
#include <stdlib.h>

int main(){

        int i=1, j=7, contador = 0;
        int time = 0;

        while (contador < 15) {
            printf("I=%d J=%d\n",i,j);
            j = j - 1;
            time = time + 1;

            if (time == 3) {
                j = j + 5;
                i = i + 2;
                time = 0;
            }
            contador++;
        }
    return 0;

}



