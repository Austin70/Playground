#include <iostream>

#include <iomanip>

using namespace std;

int main()

{

int num;

float marks=0.0 ;

for(int i=0;i<3;)

{

cin>>num;

if(num<0)

{

marks=marks-1;

break;

}

else if(num%2==0)

{

marks=marks-0.5;

}

else{

marks=marks+1;

i++;

}

}

cout<<marks<<endl;

}

/*4.7
12 votes

THANKS 
11
Comments  Report

The Brain  Helper
Not sure about the answer?
SEE NEXT ANSWERS
Newest Questions
The number of times you want a presentation to be printed can be chosen from the ______option.​
Which pokemon is this​
Who among the following is considered as the father of Artificial Intelligence?
Without me you couldn't talk over oceans there would be no bitcoin even though I died before the Internet who am I?
How to use AI in ecommerce?
I typed 16 words 14 seconds with error in only 1 word . What is the speed in WPM and Net WPM .
IBM Lotus is a speed sheet.True or False?
Which of the following network topologies connectsall the resources to a common channel?a. Busb. Starc. Ringd. Comet​
Bubble sort compares _____ elements of an array at a time.​
IBM Lotus 1-2-3 is a spreadsheet.True or False??
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
This site is using co*/