#include <iostream>

using namespace std;

int main(){

        int pares=0, impar=0, positivo=0, negativo=0;

        for (int i = 0; i < 5; i++) {
            int numeros;
            cin>>numeros;

            if (numeros % 2 == 0) {
                pares++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            } else {
                impar++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            }
        }

        cout<<pares<<" valor(es) par(es)"<<endl;
        cout<<impar<<" valor(es) impar(es)"<<endl;
        cout<<positivo<<" valor(es) positivo(s)"<<endl;
        cout<<negativo<<" valor(es) negativo(s)"<<endl;

    return 0;

}



