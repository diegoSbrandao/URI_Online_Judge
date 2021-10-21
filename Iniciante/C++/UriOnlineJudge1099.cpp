#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

void somaImpar(int x, int y);

int main(){

       int n = 0, i;
       cin>>n;
       int x=0, y=0;

        for (i = 0; i < n; i++) {
            int aux = 0;

            cin>>x>>y;

            if (x > y) {
                aux = y;
                y = x;
                x = aux;
            }
            somaImpar(x, y);
        }
        return 0;
}

void somaImpar(int x, int y) {
        x = x+1;
        int soma = 0,i;
        for (i = x; i < y; i++) {
            if (i % 2 != 0) {
                soma+=i;
            }
        }
          cout<<soma<<endl;
}





