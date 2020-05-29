#include<iostream>
int main()
{
int a,b,s,c=0;
  std::cin>>a>>b;
  
s=a+b;
  for(int i=1;s!=i;i++)
  if(s%i==0)  
  c+=i;
  if(c==s)
    printf("They can read the message");
  else
    printf("They can't read the message");


return 0;
}