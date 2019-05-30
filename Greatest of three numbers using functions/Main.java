#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3,x;
  scanf("%d %d %d",&n1,&n2,&n3);
  x=big(n1,n2);
    printf("%d",big(x,n3));

  	return 0;
}
int big(int n1,int n2)
{
  if(n1>n2)
    return n1;
  else
    return n2;
}