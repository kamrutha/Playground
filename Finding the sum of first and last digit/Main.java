#include <stdio.h>
int main() {
	//Type your code
  int x,n,t,last,first;
  scanf("%d",&n);
 
  last=n%10;
  while(n>=10)
  {
  n=n/10;
  }
  first=n;
  printf("%d",first+last);
	return 0;
}