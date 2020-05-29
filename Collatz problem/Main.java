#include<iostream>
using namespace std;
int main()
{int c=0,a;
 std::cin>>a;
 for(int i=a;i!=1;)
 {printf("%d\n",i);
   if(i%2==0)
     i=i/2;
 else
   i=3*i+1;
  c+=1;
 }
 
  
   printf("1\n%d",c);
  //Type your code here.
}