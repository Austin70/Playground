#include <iostream>

using namespace std;

int calculatePower(int, int);

int main()

{

int a, powerRaised, result;

cout << "Enter the value of a \n";

cin >> a;

cout << "Enter the value of n \n";

cin >> powerRaised;

result = calculatePower(a, powerRaised);

cout << "The value of " << a << " power " << powerRaised << " is " <<result;
return 0;

}

int calculatePower(int a, int powerRaised)

{
if(powerRaised != 0)

return (a*calculatePower(a, powerRaised-1));

else

return 1;

}
/*
Read more on Brainly.in - https://brainly.in/question/17088935#readmore*/