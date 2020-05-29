#include <iostream>
int main() 
{int a;
 std::cin>>a;
   while(a%10==0)
     a=a/10;
 while(a!=0)
 { printf("%d",a%10);
   a=a/10;}
   
	// Type your code here
	return 0;
}