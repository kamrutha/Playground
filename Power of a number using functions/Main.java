#include<stdio.h>
int main(){
    // Type your code here
  int b,e;
  scanf("%d %d",&b,&e);
  printf("%d",power(b,e));
  	return 0;
}
int power(int x1,int x2)
{
  int p=x1;
  for(int i=1;i<x2;i++)
  {
    p=p*x1;
  }
  return p;
}