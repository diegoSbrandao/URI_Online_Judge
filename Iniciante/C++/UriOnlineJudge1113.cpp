#include <iostream>

using namespace std;

int main(){

    int x, y;

    while (1){

        cin>>x>>y;
        if(x==y)break;
        cout<<((x > y) ? "Decrescente\n" : "Crescente\n");
    }
    return 0;
}



