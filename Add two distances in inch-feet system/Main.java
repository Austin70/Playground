
/*

Search Programiz
C++ Program to Add Two Distances (in inch-feet) System Using Structures
C++ Program to Add Two Distances (in inch-feet) System Using Structures
This program takes two distances (in inch-feet system), adds them and displays the result on the screen.

To understand this example, you should have the knowledge of the following C++ programming topics:

C++ Structures
C++ if, if...else and Nested if...else
Example: Add Distances Using Structures*/
#include <iostream>
using namespace std;

struct Distance{
    int feet;
    float inch;
}d1 , d2, sum;

int main()
{
    //cout << "Enter 1st distance," << endl;
   // cout << "Enter feet: ";
    cin >> d1.feet;
   // cout << "Enter inch: ";
    cin >> d1.inch;

   // cout << "\nEnter information for 2nd distance" << endl;
  //  cout << "Enter feet: ";
    cin >> d2.feet;
  //  cout << "Enter inch: ";
    cin >> d2.inch;

    sum.feet = d1.feet+d2.feet;
    sum.inch = d1.inch+d2.inch;

    // changing to feet if inch is greater than 12
    if(sum.inch > 12)
    {
        ++ sum.feet;
        sum.inch -= 12;
    } 

    cout <<  sum.feet << "'-" << sum.inch << "\"";
    return 0;
}