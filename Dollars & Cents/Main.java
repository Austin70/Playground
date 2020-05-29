#include<iostream>
using namespace std;
int main()
{int a,b,c,d,e,f;
 std::cin>>a>>b>>c>>d;
 e=a+c;
 f=b+d;
 if(f>100)
 {
 e+=1;
   f-=100;
 
 }
 printf("%d\n%d",e,f);
  //Type your code here.
}