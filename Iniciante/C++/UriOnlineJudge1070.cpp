#include <iostream>

using namespace std;

int main(){

        int x,cont = 0;
       cin>>x;

        while (cont <6){
            if(x%2!=0){
                cont++;
                cout<<x<<endl;
            }
        x++;
        }

    return 0;

}



