#include<iostream>
int main()
{int a,s=1;
 std::cin>>a;
 for (int i=2;i<a;i++)
   if(a%i==0)
   {  s=0;break;}
  if( a!=1)
  {
  if(s==1)
    printf("Eligible");
 else
   printf("Not eligible");
  }
 else
   printf("Not eligible");
  
  
  
  
  
  
  
  
}