#include <iostream>

using namespace std;

int main(){
    int N = 0, X = 0;

    cin>>N;

    for(int i=0; i < N ; i++) {

        cin>>X;

        if (!X) {
              cout<<"NULL"<<endl;
        }

        if (X%2 == 0 && X!=0){

            if (X > 0) {
                  cout<<"EVEN POSITIVE"<<endl;
            }
            else{
                cout<<"EVEN NEGATIVE"<<endl;
            }
        }

        if (X%2 != 0 && X!=0){

            if (X > 0){
                cout<<"ODD POSITIVE"<<endl;
            }
            else{
                  cout<<"ODD NEGATIVE"<<endl;
            }
        }

    }
    return 0;

}



