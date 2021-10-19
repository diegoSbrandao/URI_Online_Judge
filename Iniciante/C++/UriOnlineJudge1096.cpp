#include <iostream>

using namespace std;

int main(){

        int i=1, j=7, contador = 0;

        while (contador < 15) {

        cout<<"I="<<i<<" J="<<j<<endl;
        j = j - 1;

            if(j<5){
                i = i + 2;
                j = 7;
            }
         contador = contador + 1;
	}
    return 0;

}



