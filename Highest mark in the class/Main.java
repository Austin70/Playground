/*Brainly.in

What is your question?


1
Secondary School  Computer science  5 points
Highest mark in the class The teacher who handles science for 3rd-standard class distributes the mark sheets to her students, she needs to find the highest mark among the "n" students. Help the teacher to find the maximum mark. ﻿Input Format: The first input contains an integer 'n' which denotes the number of students The remaining input denotes mark of 'n' students separated by spaces Output Format: Print the highest mark Sample Input: 5 45 67 89 34 22 Sample Output: 89
Ask for details  Follow  Report  by Simranchugh9085 4 weeks ago
Answers
jsrijareddy92  Helping Hand*//*
#include<iostream>

int main()

{

int n,i,value,j;

std::cin>>n;

 int a[n];

 for( i=0; i<=n; i++)

 {

   std::cin>>a[i];

 }

     value=a[0];

   

 for(i=1;i<n;i++)

 {

   if(a[i]>value)

   

     value=a[i];

   

}

std::cout<<value;

 return 0;

}

3.7
3 votes

THANKS 
2
Comments  Report
pranalipatil3620  Helping Hand
Answer:*/

#include<iostream>

using namespace std;

int main()

{

 int n,max;

 cin>>n;

 int arr[n];

 for(int i=0;i<n;i++)

 {

   cin>>arr[i];

 }

 max=arr[0];

 for(int i=0;i<n;i++)

 {

   if(arr[i]>max)

     max=arr[i];

 }

  cout<<max;

}