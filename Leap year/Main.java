#include<stdio.h>
int main()
{
  //Type your code here
  int year;
 
    //printf("Enter a year \n");
    scanf("%d", &year);
   
    if ((year % 4) == 0)
       printf("Leap year");
    else
       printf("Not Leap year");
  return 0;
}