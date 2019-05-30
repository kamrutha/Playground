#include<stdio.h>
int sumn(int num)
{
  int sum=0;
  for(int i=1;i<=num;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main() {
    // Type your code here
  int out,n;
  scanf("%d",&n);
  out=sumn(n);
  printf("%d",out);
  	return 0;
}