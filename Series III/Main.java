/*Brainly.in

What is your question?


1
Secondary School  Computer science  5 points
Series III
Write a program to generate the first 'n' terms of the following series 6, 11, 21, 36, 56,...Input Format:

The input is an integer 'n' which denotes the number of terms to be printed in the series.

Output Format:

Print the series and refer the sample output for formatting.

Sample Input:

6

Sample Output:

6 11 21 36 56 81

give the code in c++
Ask for details  Follow  Report  by Acharyakumar1599 4 weeks ago

Answers
THE BRAINLIEST ANSWER!
Yamini1999  Virtuoso
Answer:
*/
#include<iostream>

using namespace std;

int main()

{

 int n,i,j=6,sum=5;

 cin>>n;

 for (i=1;i<=n;i++)

 {

 cout<<j<<" ";

 j=j+sum;

  sum=sum+5;  

 }

 return 0;

}