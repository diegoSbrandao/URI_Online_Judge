#include <iostream>

using namespace std;

int main(){

      double X, Y;
      cin>>X>>Y;


        while (1) {
            if (X > 0.0 && Y < 0.0) {
                cout<<"quarto"<<endl;

            } else if (X > 0.0 && Y > 0.0) {
                cout<<"primeiro"<<endl;

            } else if (X < 0.0 && Y < 0.0) {
                 cout<<"terceiro"<<endl;

            } else if (X < 0.0 && Y > 0.0) {
            cout<<"segundo"<<endl;
            }

            cin>>X>>Y;
            if(X==0 || Y==0)break;
        }

    return 0;
}


