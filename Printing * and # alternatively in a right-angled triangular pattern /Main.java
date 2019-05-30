#include <stdio.h>
int main(){
	// Type your code here
  int row,col,n;
  int turn=0;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
    for(col=1;col<=row;col++)
    {
      if( turn==0)
      {
      printf("*");
        turn=1;
      }
      else
      {
        printf("#");
        turn=0;
      }
    }
    printf("\n");
  }
  	return 0;
}