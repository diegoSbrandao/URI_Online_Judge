#include <iostream>

using namespace std;

int main(){


    int n,i;
    cin>>n;
    float x,y;

    for (i =0; i < n; i++){

           cin>>x>>y;

      if(y==0){
            cout<<"divisao impossivel"<<endl;
           }
           else{
             printf("%.1f\n",x/y);
           }

    }

    return 0;
}


