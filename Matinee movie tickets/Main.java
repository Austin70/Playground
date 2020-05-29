#include<iostream>
using namespace std;
int main()
{int a;
 float b;
 std::cin>>a>>b;
 if(b<12.00)
 {if(a<13)
   printf("$4.00");
  else
    printf("$8.00");
           }
  else if(a<13)
           printf("$2.00");
           else
           printf("$5.00");
  //Type your code here.
}