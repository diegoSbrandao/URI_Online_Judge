#include <iostream>

using namespace std;

int main() {

    int dia = 1440;
    int horaInicial, minutoInicial, horaFinal, minutoFinal;
    cin>>horaInicial>>minutoInicial>>horaFinal>>minutoFinal;

    horaInicial *= 60;
    horaFinal *= 60;
    minutoInicial +=horaInicial;
    minutoFinal +=horaFinal;

    if (minutoFinal<= minutoInicial){
        minutoFinal+= dia;
    }
    cout<<"O JOGO DUROU "<<(minutoFinal-minutoInicial)/60<<" HORA(S) E "<<(minutoFinal-minutoInicial)%60<<" MINUTO(S)"<<endl;
    return 0;
}



