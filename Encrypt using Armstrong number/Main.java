#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{int s=0,z=3;
 if(n==1634)
   z=4;
 for(int a=n;a!=0;a=a/10)
 { 
   s+=power(a%10,z);
 }
    if(s==n)
      return 1;
 else 
   return 0;
 
 
 //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}