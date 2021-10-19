#include <iostream>

using namespace std;

int main(){

      int n = 0, x = 0, in = 0, out = 0;
      cin>>n;


        for(int i = 0; i < n; i++){

            cin>>x;
            if(x >= 10 && x <= 20){
                in++;
                continue;
            }
            out++;
        }
        cout<<in<<" in"<<endl;
        cout<<out<<" out"<<endl;

    return 0;

}



