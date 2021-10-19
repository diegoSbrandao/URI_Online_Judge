#include <iostream>

using namespace std;

int main(){

        int x = 0;
        cin>>x;

        for(int i =1; i <= x; i++){

            if(i%2==0){
                int potencia = i*i;
                cout<<i<<"^2 = "<<potencia<<endl;
            }

        }
    return 0;

}



