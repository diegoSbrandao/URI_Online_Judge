#include <iostream>

using namespace std;

int main(){

double notas, media = 0, cont = 0;

        while (1) {

            cin>>notas;

            if (notas < 0.0 || notas > 10.0) {
                cout<<"nota invalida"<<endl;
            } else {
                media += notas;
                cont++;
                if (cont == 2) {
                    cout<<"media = "<<media / cont<<endl;
                    break;
                }
            }
        }

    return 0;
}



