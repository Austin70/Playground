#include<iostream>
using namespace std;
int main()
{int x,y,r;
 float a,b,c,d;
 std::cin>>x>>y>>r;
 a=.02*((x*y*r/100));
 b=(x+(x*y*r/100))*1.00;
 std::cout<<r*y*x/100<<"\n"<<b<<"\n"<<a<<"\n"<<b-a;
 
  //Type your code here.
}