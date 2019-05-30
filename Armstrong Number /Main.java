#include <stdio.h>
int main() {
	//Type your code
  int n,x,num=0,k,i,t,real;
  scanf("%d",&n);
  t=n;
  real=t;
  while(t>0)
  {
    x=t%10;
    t=t/10;
    k++;
  }
 // printf("%d",k);
  
  for(i=1;i<=k;i++)
  {
    x=n%10;
    num=num+pow(x,k);
    n=n/10;
  }
  //printf("%d",num);
  if(real==num)
    printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
	return 0;
}