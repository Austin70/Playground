#include<iostream>
using namespace std;
int main()
{int a,s=0;
 std::cin>>a;
 for(int i=a;i!=0;i=i/10)
   s=s+(i%10);
 if(a%s==0)
   printf("Harshad Number");
 else
   printf("Not Harshad Number");
  //Type your code here.
}