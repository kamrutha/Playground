#include <stdio.h>
int main(){
	// Type your code here
  int row,col,n;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
    for(col=1;col<=n;col++)
    {
      printf("%d",row);
    }
    printf("\n");
  }
  	return 0;
}