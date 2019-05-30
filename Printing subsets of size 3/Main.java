#include<stdio.h>
int main()
{
  //Type your code here
  int arr[100];
  int size,i1,i2,i3,i;
  scanf("%d",&size);
  for(int i=0;i<size;i++)
    scanf("%d",&arr[i]);
  for(i1=0;i1<=size-2;i1++)
  {
    for(i2=i1+1;i2<=size-1;i2++)
    {
      for(i3=i2+1;i3<=size-1;i3++)
      {
        printf("(%d, %d, %d) ",arr[i1],arr[i2],arr[i3]);
      }
    }
    printf("\n");
  }
  
  return 0;
}