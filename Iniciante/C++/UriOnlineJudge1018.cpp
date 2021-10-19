#include <iostream>

using namespace std;

int main() {

        int N;
        cin >> N;

        int X100,X50,X20,X10,X5,X2,X1,RES = N;

        while (RES != 0) {
            X100 = RES / 100;
            RES -= (X100 * 100);

            X50 = RES / 50;
            RES -= (X50 * 50);

            X20 = RES / 20;
            RES -= (X20 * 20);

            X10 = RES / 10;
            RES -= (X10 * 10);

            X5 = RES / 5;
            RES -= (X5 * 5);

            X2 = RES / 2;
            RES -= (X2 * 2);

            X1 = RES / 1;
            RES -= (X1 * 1);
        }

        cout<<N<<endl;
        cout<<X100<<" nota(s) de R$ 100,00"<<endl;
        cout<<X50<<" nota(s) de R$ 50,00"<<endl;
        cout<<X20<<" nota(s) de R$ 20,00"<<endl;
        cout<<X10<<" nota(s) de R$ 10,00"<<endl;
        cout<<X5<<" nota(s) de R$ 5,00"<<endl;
        cout<<X2<<" nota(s) de R$ 2,00"<<endl;
        cout<<X1<<" nota(s) de R$ 1,00"<<endl;

   return 0;
}



