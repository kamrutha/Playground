#include<stdio.h>
int square(int num)
{
  int x;
  x=num*num;
  return x;
}
int main() {
   // Type your code here
  int out,a;
  scanf("%d",&a);
  out=square(a);
  printf("%d",out);
   return 0;
}