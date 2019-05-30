#include <stdio.h>
int main() {
	//Type your code here
  int n1,n2,n3,x;
  scanf("%d %d %d",&n1,&n2,&n3);
  x=gcd(n1,n2);
  printf("%d",gcd(x,n3));
	return 0;
}
int gcd(int n1,int n2)
{
  int min,g;
  if(n1<n2) min=n1;
  else min=n2;
  while(min>1)
  {
    if(n1%min==0 && n2%min==0)
    {
      g=min;
      break;
    }
  }
 
    return g;
  }