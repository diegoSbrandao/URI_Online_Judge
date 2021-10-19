#include <iostream>

using namespace std;

int main() {
        int a, b;
        cin>>a>>b;
        char multi = 's';

        multi = (a%b==0 || b%a==0 ) ? 'S': 'N';

        if(multi=='S'){
        cout<<"Sao Multiplos"<<endl;
        }
        else{
        cout<<"Nao sao Multiplos"<<endl;
        }
    return 0;
}



