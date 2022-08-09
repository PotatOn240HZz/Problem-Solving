// Time in milliseconds: 31

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
 int main()
{
 int input,range;
 cin >>range;
 for (int i = 0; i < range; i++)
 {
  cin >> input;
  if (input <= 9)
   cout << input<<endl;
  else if (input >= 50)
   cout << "-1"<<endl;
  else
  {
   int number = 9;
   string answer;
   while (input > number && number != 0)
   {
    input -= number;
    answer += to_string(number);
    number--;
   }
   answer += to_string(input);
   reverse(answer.begin(), answer.end());
   if (number == 0)
    cout << "-1"<<endl;
   else
   cout << answer << endl;
  }
 }
 return 0;
}