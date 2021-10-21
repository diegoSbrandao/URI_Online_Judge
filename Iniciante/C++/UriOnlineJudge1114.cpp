#include <iostream>

using namespace std;

int main(){

    int x = 2002, y;

    for (;;){

        cin>>y;

        cout<<((x == y) ? "Acesso Permitido\n" : "Senha Invalida\n");
        if(x==y)break;
    }

return 0;
}



