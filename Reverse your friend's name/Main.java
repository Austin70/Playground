#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() 
{ 
//T
int x,i,n;

string str;

getline(cin,str);

reverse(str.begin(),str.end());

cout<<str;

return 0;
}