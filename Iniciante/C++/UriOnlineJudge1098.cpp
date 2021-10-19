#include <iostream>

using namespace std;

int main(){

    float i, j, valor;

    int temp, temp2;

    for (i = 0, j = 1, valor = 0, temp = 0, temp2 = 0; i < 2.2; j++)
    {
        if(temp2 == 0){
            cout<<"I="<<i<<" J="<<j<<endl;
        }else{
            cout<<"I="<<i<<" J="<<j<<endl;
        }
        temp++;

        if(temp == 3){

            i += 0.2;

            valor += 0.2;

            j = valor;

            temp = 0;

            temp2++;
        }
        if(temp2 == 5)

            temp2 = 0;
    }
    return 0;
}

