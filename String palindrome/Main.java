#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char st[20],temp[20];
  int l,i;
  gets(st);
  l=strlen(st);
  for(i=0;i<l;i++)
  {
    temp[i]=st[l-i-1];
  }
  if(strcmp(st,temp))
  printf("%s is not a palindrome",st);
  else
    printf("%s is a palindrome",st);
  
  return 0;
}
