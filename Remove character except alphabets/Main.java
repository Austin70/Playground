/*Brainly.in

What is your question?


Secondary School  Computer science  5 points
In a blind organization, they were playing the typing a keyword game and they want to correct the form of the word. So help them to by writing a program to remove all special symbols and print the characters of a string.
Ask for details  Follow  Report  by Vidhupriya 2 weeks ago
Answers
vijayaravindh  Helping Hand
Answer:
*/
#include <bits/stdc++.h>

using namespace std;

int main()

{

   char str[150];

   int i, j;

   cin >> str;

   for(i = 0; str[i] != '\0'; ++i)

   {

       while (!( (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z') || str[i] == '\0') )

       {

           for(j = i; str[j] != '\0'; ++j)

           {

               str[j] = str[j+1];

           }

           str[j] = '\0';

       }

   }

   cout << str << endl;

   return 0;

}