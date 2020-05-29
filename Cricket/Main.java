#include<iostream>
using namespace std;
int main()
{float a,b,c,e;
 int d,v,m;
 std::cin>>a>>b>>c>>d;
 a=a/6;
 v=int(b/a*100);
 m=v%10;
 m>=5?v+=(10-m):v-=m;
 b=float(v/100.0);
 e=d/6+(d%6)*0.1;
 v=int(c/e*100);
 m=v%10;
 m>=5?v+=(10-m):v-=m;
 c=float(v/100.0);
 std::cout<<a<<"\n"<<e<<"\n"<<c<<"\n"<<b<<"\n";
 if(c>b)
   std::cout<<"Eligible to Win";
 else
   std::cout<<"Not Eligible to Win";
  //Type your code here.
}