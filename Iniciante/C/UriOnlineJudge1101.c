#include <stdio.h>
int main(){

    int m,n,x,y=0;

    for(;;){

        scanf("%d %d", &m, &n);

        if(m<=0 || n<=0)
            break;
        else
        {
            y=0;
            if(m<n)
            {
                for(x=m; x<=n; x++)
                {
                    printf("%d ",x);
                    y+=x;
                }
                printf("Sum=%d\n",y);
            }
            else if(m>n)
            {
                for(x=n; x<=m; x++)
                {
                    printf("%d ",x);
                    y+=x;
                }
                printf("Sum=%d\n",y);
            }
        }
    }
    return 0;
}
