#include<stdio.h>
int main()
{
  //Type your code here
  int x;
  scanf("%d",&x);
  switch(x)
  {
    case 1:printf("one");break;
    case 2:printf("two");break;
    case 3:printf("Three");break;
    case 4:printf("four");break;
    case 5:printf("five");break;
  default:printf("Invalid");
  }
  return 0;
}