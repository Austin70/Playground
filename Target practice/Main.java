/*Brainly.in

What is your question?


1
Secondary School  Computer science  5 points
Drona normally trains his disciples using a board which consists of concentric circles. When a student correctly hits the center of the concentric circles, his score is 100. The score gets reduced depending on where the students hit on the board. When the student hits outside the board, his score is 0. Drona will not allow a student to have his food unless he scores 100. Arjuna will always hit the target in his first attempt and he will leave early. Others may take more turns to reach a score of 100. Now, write a program to determine the number of turns a disciple takes to reach the target score of 'n'.
Ask for details  Follow  Report  by Sayatambe999 24.04.2020

Answers
 bipinvjohn
bipinvjohn  Helping Hand
Answer:*/

/*#include <iostream>

using namespace std;

 

int main(void)

{

   int target, score, attempt=0, sum=0;

cin>>target;

while(sum<target)

{

 cin>>score;

 sum=sum+score;

 attempt++;

}

cout<<"The number of turns is "<<attempt<<"\n";

}

4.2
13 votes

THANKS 
15
Comments  Report
MSFLAB3  Ambitious
Answer:
*/
#include<iostream>

using namespace std;

int main()

{

 int n,n1,s,t=1;

 cin>>n>>n1;

 s=n1;

 while(s<n)

 {

   cin>>n1;

   s+=n1;

   t++;

 }

 cout<<"The number of turns is "<<t;

}