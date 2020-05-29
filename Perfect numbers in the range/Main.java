#include<iostream>
int main()
{
int a,b,s=0;
  std::cin>>a>>b;
  for(int i=a;i<=b;i++)
  { s=0;
    for(int j=1;j<i;j++)
      if(i%j==0)
        s+=j;
  if(i==s)
    printf("%d ",s);
  }

return 0;

}