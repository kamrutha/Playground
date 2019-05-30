#include<stdio.h>
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(prime(i))
    {
      printf("%d\n",i);
    }
  }
    return 0;
}
int prime(int n)
{
  int flag=1;
  for(int num=2;num<=n/2;num++)
  {
    if(n%num==0)
    {
      flag=0;break;
    }
  }
  return flag;
}