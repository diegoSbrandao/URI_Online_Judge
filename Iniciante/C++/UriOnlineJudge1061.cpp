#include <iostream>

using namespace std;

int main(){

     int dia, diafim, hora, horafim, minuto, minutofinal, segundo, segundofinal;
     char aux [4], c;

     cin>>aux>>dia;
     cin>>hora>>c>>minuto>>c>>segundo;
     cin>>aux>>diafim;
     cin>>horafim>>c>>minutofinal>>c>>segundofinal;

    segundo = segundofinal - segundo;
    minuto = minutofinal - minuto;
    hora = horafim - hora;
    dia = diafim - dia;

    if (segundo < 0)
    {
        segundo += 60;
        minuto--;
    }

    if (minuto < 0)
    {
        minuto += 60;
        hora--;
    }

    if (hora < 0)
    {
        hora += 24;
        dia--;
    }

    cout<<dia<<" dia(s)"<<endl;
    cout<<hora<<" hora(s)"<<endl;
    cout<<minuto<<" minuto(s)"<<endl;
    cout<<segundo<<" segundo(s)"<<endl;

    return 0;

}



