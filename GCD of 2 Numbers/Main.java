#include<iostream>
using namespace std;
int gcd(int, int);
 
int main()
{
    int a, b, result;
 
   // printf("Enter the two numbers to find their GCD: ");
    scanf("%d%d", &a, &b);
    result = gcd(a, b);
    printf("G.C.D of %d and %d = %d\n", a, b, result);
}
 
int gcd(int a, int b)
{
    while (a != b)
    {
        if (a > b)
        {
            return gcd(a - b, b);
        }
        else
        {
            return gcd(a, b - a);
        }
    }
    return a;
}