#include <iostream>

using namespace std;

int main(){

       int pares;

        for(int i = 0; i < 5; i++){
            int numeros = 0;

            cin>>numeros;

            if(numeros%2== 0){
                pares++;
            }
        }
        cout<<pares<<" valores pares"<<endl;

    return 0;

}



