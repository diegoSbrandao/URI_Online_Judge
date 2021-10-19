#include <iostream>

using namespace std;

int main() {

        int N,ano, mes, dias;
        cin>>N;

        int RES = N;

        while (RES != 0) {
            ano = RES / 365;
            RES = RES - (ano * 365);

            mes = RES / 30;
            RES = RES - (mes * 30);

            dias = RES / 1;
            RES = RES - (dias * 1);

        }

        cout<<ano<<" ano(s)"<<endl;
        cout<<mes<<" mes(es)"<<endl;
        cout<<dias<<" dia(s)"<<endl;

   return 0;
}



