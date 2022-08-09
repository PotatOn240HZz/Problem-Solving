// Time in milliseconds: 31

#include <iostream>
using namespace std;
int  main()
{
 int destination;
 int steps = 0;
 cin >> destination;
 while (destination > 0)
 {
  destination -= 5;
  steps++;
 }
 cout << steps;
 return 0;
}