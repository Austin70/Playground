#include<iostream>
using namespace std;
int main()
{int a,b=0,c=1;
 std::cin>>a;
 for(int i=1;i<a;i++)
 {c=b+c;
  b=c-b;
 }
 printf("%d",b);
 
 
 
 
  //Type your code here.
}