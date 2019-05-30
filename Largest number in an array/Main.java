#include<stdio.h>
int main()
{
  //fill the code
  int arr_size;
  int arr[arr_size];
  scanf("%d",&arr_size);
  for(int i=0;i<arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int temp;
  for(int i=0;i<arr_size;i++)
  {
    if(arr[0]>arr[1])
      temp=arr[0];
    else
      temp=arr[1];
  }
  for(int i=2;i<arr_size;i++)
  {
   if(temp<arr[i])
     temp=arr[i];
  }
  printf("%d",temp);

  return 0;
}