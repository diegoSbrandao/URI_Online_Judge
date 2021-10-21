#include <iostream>

using namespace std;


int main(){

    int n,a,b,c;
    cin>>n;

    for (int i=0; i<n; i++){
        c=0;
        cin>>a>>b;

        if (a>b){
            a+=b;
            b=a-b;
            a-=b;
        }

        for (int k=a+1; k<b; k++){
            if (k%2==1) c+=k;
        }
        cout<<c<<endl;
    }
    return 0;
}



