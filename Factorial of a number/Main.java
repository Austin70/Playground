#include<iostream>
int main(){
  int a,f=1;
  std::cin>>a;
  for (int i=a;i!=0;i--)
    f*=i;
  printf("%d",f);
  // Type your code here
}