#include<stdio.h>
int main()
{
 int i,j,n[9999],m,t,a[20],q=1;
 scanf("%d",&m);
  //printf("%d\n",m);
 for(i=1;i<m;i++)
  {
   scanf("%d",&n[i]);
  }
 for(i=0;i<m,q<=m;i++)
 {
   a[i]=q;
   q++;
 }
 /* for(i=0;i<m;i++)
    printf("%d",a[i]);
  for(i=0;i<m;i++)
    printf("\t %d",n[i]);*/
  int sum=0,d=0,p;
  for(i=0;i<m;i++)
  {
    sum=sum+a[i];
  }
  for(i=0;i<m;i++)
  {
    d=d+n[i];
  }
  //printf("%d %d\n",sum,d);
  p=sum-d;
  printf("%d\n",p);
  
  
  
  
 
 return 0;
}