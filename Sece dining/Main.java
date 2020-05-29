#include<iostream>
//#include<string>
using namespace std;
int main()
{int a;
 char b[10];
 std::cin>>b>>a;
 if(b[0]=='f')
 {if(a==1)
    printf("Left Handed");
  else
    printf("Right Handed");
 }
 else if(a==1)
   printf("Right Handed");
 else
   printf("Left Handed");
  //Type your code here.
}