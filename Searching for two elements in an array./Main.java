#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size,s1,s2;
  int arr[arr_size];
  scanf("%d",&arr_size);
  for(int i=0;i<arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&s1);
  scanf("%d",&s2);
   int f1=-1,f2=-1;
  for(int i=0;i<arr_size;i++)
  {
    if(s1==arr[i])
    {
      f1=i;
      
    }
   
    if(s2==arr[i])
    {
      f2=i;
      
    }
    
  }
  printf("%d\n",f1);
  printf("%d\n",f2);
    
  return 0;
}