#include<iostream>
using namespace std;
int main()
{int a,b,c,d=0;
 
 std::cin>>a>>b>>c;
 if(c<=b)
   d=1;
 for(int i=b;i<=a*b;i+=(b-1))
 {if(c%i==0)
 {d=1;break;}
 i++;
  if(c%i==0)
  {d=1;break;}
 }
 if(d==1)
   printf("Yes");
 else
   printf("No");
  //Type your code here.
}