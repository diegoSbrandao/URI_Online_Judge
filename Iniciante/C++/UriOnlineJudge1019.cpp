#include <iostream>

using namespace std;

int main() {

        int N,hora, minutos, segundos;
        cin >> N;
        int RES = N;

        while (RES != 0) {
            hora = RES / 3600;
            RES = RES - (hora * 3600);

            minutos = RES / 60;
            RES = RES - (minutos * 60);

            segundos = RES / 1;
            RES = RES - (segundos * 1);

        }

        cout<<hora<<":"<<minutos<<":"<<segundos<<endl;

   return 0;
}



