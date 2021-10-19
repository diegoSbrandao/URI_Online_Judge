#include <iostream>

using namespace std;

int main(){

        int i=1, j=7, contador = 0;
        int time = 0;

        while (contador < 15) {
            cout<<"I="<<i<<" J="<<j<<endl;
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



