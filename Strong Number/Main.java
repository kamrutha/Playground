#include <stdio.h>
int main() {
	//Type your code
  int n,x,num=1,sum=0,fact,t;
  scanf("%d",&n);
  t=n;
  while(n>0)
  {
    x=n%10;
       num=1;   
  for(int i=1;i<=x;i++)
  {
    
    num=num*i;
  }
   sum=sum+num;
     n=n/10;

  }
 // printf("%d",sum);
  //printf("%d\n",x);
  if(t==sum)
    printf("Yes");
  else printf("No");
	return 0;
}