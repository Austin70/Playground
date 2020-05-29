#include <iostream>
using namespace std;

struct TIME
{
  int seconds;
  int minutes;
  int hours;
};

void computeTimeDifference(struct TIME, struct TIME, struct TIME *);

int main()
{
    struct TIME t1, t2, difference;

   // cout << "Enter start time." << endl;
    //cout << "Enter hours, minutes and seconds respectively: ";
    cin >> t1.hours >> t1.minutes >> t1.seconds;

   // cout << "Enter stop time." << endl;
   //cout << "Enter hours, minutes and seconds respectively: ";
    cin >> t2.hours >> t2.minutes >> t2.seconds;

    computeTimeDifference(t1, t2, &difference);

   // cout << endl << "TIME DIFFERENCE: " << t1.hours << ":" << t1.minutes << ":" << t1.seconds;
   // cout << " - " << t2.hours << ":" << t2.minutes << ":" << t2.seconds;
   cout << difference.hours << ":" << difference.minutes << ":" << difference.seconds;
    return 0;
}
void computeTimeDifference(struct TIME t1, struct TIME t2, struct TIME *difference){
    
    if(t2.seconds > t1.seconds)
    {
        --t1.minutes;
        t1.seconds += 60;
    }

    difference->seconds = t1.seconds - t2.seconds;
    if(t2.minutes > t1.minutes)
    {
        --t1.hours;
        t1.minutes += 60;
    }
    difference->minutes = t1.minutes-t2.minutes;
    difference->hours = t1.hours-t2.hours;
}
/*Output

Enter hours, minutes and seconds respectively: 11
33
52
Enter stop time.
Enter hours, minutes and seconds respectively: 8
12
15

TIME DIFFERENCE: 11:33:52 - 8:12:15 = 3:21:37
In this program, user is asked to enter two time periods and these two periods are stored in structure variables t1 and t2 respectively.
*/
