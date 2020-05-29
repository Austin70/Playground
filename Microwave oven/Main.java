#include<iostream>
using namespace std;
int main()
{int a;
 float b;
 std::cin>>a>>b;
 if(a==2)
   b=b+(b/2);
 else if(a==3)
   b=b*2;
 if(a>3)
   printf("Number of items is more");
 else
 printf("%.2f",b);
  //Type your code here.
}