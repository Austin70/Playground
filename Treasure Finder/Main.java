#include<iostream>
using namespace std;
int main()
{int a,b,c,s,m;
 std::cin>>a>>b>>c;
 if(a<b)
 {if(c<a)
 {m=a;s=c;}
  else if(c<b)
  {    m=c;s=a;}
  else
  {m=b;s=a;}
 }
 else if(c<b)
 {  m=b;s=c;}
 else if(a<c)
 {m=c;s=b;}
 else
 {m=c;s=b;} 
 printf("The treasure is in box which has number %d\n",m);
 for(int i=s;i!=0;i--)
 {
   if(c%i!=0)
     continue;
   if(b%i!=0)
     continue;
   if(a%i!=0)
     continue;
   s=i;
   break;
   
   
 
 
 
 }
 printf("The code to open the box is %d",s);
    
  //Type your code here.
}