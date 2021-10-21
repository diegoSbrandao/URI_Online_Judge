#include <stdio.h>

int main(){

    int x = 2002, y;

    for (;;){
        scanf("%d",&y);

        printf((x == y) ? "Acesso Permitido\n" : "Senha Invalida\n");
        if(x==y)break;
    }

return 0;
}
