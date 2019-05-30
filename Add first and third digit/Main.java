#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  int x,n;
  scanf("%d",&a);
  
  n=a/100;
  
  x=a%10;
  printf("%d\n",n+x);
  //printf("%d\n",x);
  return 0;
}