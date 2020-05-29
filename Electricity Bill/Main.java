#include<iostream>
using namespace std;
int main()
{int a;
 std::cin>>a;
 std::cout<<"Rs.";
 if(a<=200)
   std::cout<<a/2;
 else if(a<=400)
   std::cout<<a*0.65+100;
 else if(a<=600)
   std::cout<<a*0.8+200;
 else
   std::cout<<a*1.25+425;
  //Type your code here.
}