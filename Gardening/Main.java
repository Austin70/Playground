#include<iostream>
using namespace std;
int main()
{int a,b,c;
 std::cin>>a>>b>>c;
 if(((a*a-2*a<c)&&(a*a-a>=c))||((2*a>=c)&&(a<c)))
   std::cout<<"It is a mango tree";
 else 
   std::cout<<"It is not a mango tree";
  //Type your code here.
}