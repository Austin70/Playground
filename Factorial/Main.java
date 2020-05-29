

/*
Search Programiz
C++ program to Calculate Factorial of a Number Using Recursion
C++ program to Calculate Factorial of a Number Using Recursion
Example to find factorial of a non-negative integer (entered by the user) using recursion.

To understand this example, you should have the knowledge of the following C++ programming topics:

C++ Functions
Types of User-defined Functions in C++
C++ if, if...else and Nested if...else
C++ Recursion
This program takes a positive integer from user and calculates the factorial of that number. Suppose, user enters 6 then,

Factorial will be equal to 1*2*3*4*5*6 = 720
You'll learn to find the factorial of a number using a recursive function in this example.

Visit this page to learn, how you can use loops to calculate factorial.

Example: Calculate Factorial Using Recursion*/
#include<iostream>
using namespace std;

int factorial(int n);

int main()
{
    int n;

  //  cout << "Enter a positive integer: ";
    cin >> n;

    cout << "The factorial of " << n << " is " << factorial(n);

    return 0;
}

int factorial(int n)
{
    if(n > 1)
        return n * factorial(n - 1);
    else
        return 1;
}