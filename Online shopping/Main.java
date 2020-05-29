#include<iostream>
using namespace std;
int p(int a,int b,int c)
{b=b*a/100;
 return a-b+c;






}




int main()
{int a,b,c,d,e,fa,g,h,i,f,s,m;
 std::cin>>a>>b>>c>>d>>e>>fa>>g>>h>>i;
f= p(a,b,c);
 s=p(d,e,fa);
 m=p(g,h,i);
 std::cout<<"In Flipkart Rs."<<f<<"\nIn Snapdeal Rs."<<s<<"\nIn Amazon Rs."<<m<<"\nHe will prefer ";
  if(f<=s)
    if(f<=m)
      std::cout<<"Flipkart";
    else
      std::cout<<"Amazon";
 else if(s<m)
   std::cout<<"Snapdeal";
 else
   std::cout<<"Amazon";
   
 
 //Type your code here.
}