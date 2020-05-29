/*Brainly.in

What is your question?


1
Secondary School  Computer science  5 points
Write a c++ program to print the following pattern.
Sample Input:

3

Sample Output:

3 
44 
555 
6666 
6666 
555 
44 
3
Ask for details  Follow  Report  by Aishwaryasangade1 25.04.2020

Answers
THE BRAINLIEST ANSWER!
manthanjotwani2005  Helping Hand
Answer:

#include <iostream>

using namespace std;

int main()

{

int n=4,num=n-1;

for(int i=1;i<=n;i++)

{

for(int j=1;j<=i;j++)

cout<<num;

num++;

cout<<endl;

}

num–;

for(int i=n;i>=1;i–)

{

for(int j=1;j<=i;j++)

cout<<num;

num–;

cout<<endl;

}

return 0;

}

2.6
7 votes

THANKS 
4
Comments  Report
 aminvishak
aminvishak  Helping Hand
Answer:
*/
#include<iostream>

using namespace std;

int main()

{

int n = 3,n1,i,j;

cin >> n1;

for(i=1;i<=n+1;i++)

{

for(j=1;j<=i;j++)

cout<<n1;

n1++;

cout<<endl;

}

n1--;

for(i=n+1;i>=1;i--)

{

for(j=1;j<=i;j++)

cout<<n1;

n1--;

cout<<endl;

}

}