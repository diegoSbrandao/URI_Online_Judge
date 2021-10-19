#include <iostream>

using namespace std;

int main() {

        int duracao, horaInicial, horaFinal ;

        cin>>horaInicial>>horaFinal;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            cout<<"O JOGO DUROU "<<duracao<<" HORA(S)"<<endl;
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
            cout<<"O JOGO DUROU "<<duracao<<" HORA(S)"<<endl;
        }
    return 0;
}



