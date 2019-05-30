#include <stdio.h>
int main() {
	//Type your code
  int n,x,sum=0,t;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
    x=t%10;
    sum=sum+x;
    t=t/10;
  }
  printf("%d",sum);
	return 0;
}