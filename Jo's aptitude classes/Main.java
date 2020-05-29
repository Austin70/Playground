#include<iostream>

int main()

{

int n1,n2,n3,n4;

std::cin>>n1>>n2>>n3>>n4;

int small=0;

int gcd=0;

if(n1<n2&&n1<n3)

{

small=n1;

}

else if(n2<n1&&n2<n3)

{

small=n2;

}

else

small=n3;

while(small>=1)

{

if(n1%small==0&&n2%small==0&&n3%small==0)

{

gcd=small;

break;

}

small--;

}

if(gcd==n4)

std::cout<<"Answer is correct.";

else

std::cout<<"Answer is wrong.";

}
/*
4.3
6 votes

THANKS 
5
Comments  Report

The Brain  Helper
Not sure about the answer?
SEE NEXT ANSWERS
Newest Questions
C program to find sum of first 100 integers​
The number of elements in the power set p(s) of the set = {a,b,c} is
Which of the following provides command line Interface 1.DOS 2.Window 3.unix 4.Non of these​
Write a program in Java to accept a name and remove the surname from that name and display the new name​
A scanner is an input device true and false
Write a short note on "computer memory"?​
Which of the following parameters cannot be selected while creating a Neptune Database? Custom VPC Failover Priority Encryption Replication Locations
Write a short note on "computer memory"?​
On selecting the .............................. , the first character in all the words of the selected sentence will be converted to capital letters. 
Writa a algorithm and draw a flowchart a no. is even or not​
Ask your question
About us
About us
Careers
Contact
Blog
FAQ
Terms of Use
How do I receive points?
Privacy policy
Responsible disclosure program
Brainly.in

Get the Brainly App
Download Android App
This site is using cookies under cookie policy. You can specify conditions of storing and accessing cookies in your browser
SCAN & SOLVE IN-APP


Read more on Brainly.in - https://brainly.in/question/16890855#readmore
*/