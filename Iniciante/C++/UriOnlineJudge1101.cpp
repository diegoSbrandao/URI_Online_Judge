#include <iostream>

using namespace std;

int main(){

    int m,n,x,y=0;

    for(;;){

        cin>>m>>n;

        if(m<=0 || n<=0)
            break;
        else
        {
            y=0;
            if(m<n)
            {
                for(x=m; x<=n; x++)
                {
                      cout<<x<<" ";
                    y+=x;
                }
                  cout<<"Sum="<<y<<endl;
            }
            else if(m>n)
            {
                for(x=n; x<=m; x++)
                {
                    printf("%d ",x);
                    y+=x;
                }
                cout<<"Sum="<<y<<endl;
            }
        }
    }
    return 0;
}

