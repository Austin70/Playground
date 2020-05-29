#include<iostream>
int main()
{ int w,a;
std::cin>>w>>a;
if(w>=a)
{std::cout<<"Yes, you can enter.";
  if(w==a)
    std::cout<<" Kindly use a rope.";
}
 else
   std::cout<<"Sorry, you can't enter";
}