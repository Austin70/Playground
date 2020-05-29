#include<iostream>
int main()
{int a,n=0;
 std::cin>>a;
 if(a==0)
   n=1;
 while (a!=0)
 {a=a/10;
   n+=1;
 
 
 }
 printf("%d",n);
  // Type your code here
}