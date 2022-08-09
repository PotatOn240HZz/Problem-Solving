// Time in milliseconds: 31

#include <iostream>
#include <vector>
using namespace std;
int main()
{
 int times,ans=0;
 cin >> times;
 for (int i = 0; i < times; i++)
 {
  string temp;
  cin >> temp;
  if (temp == "X++" || temp == "++X")
   ans++;
  else if (temp == "X--" || temp == "--X")
   ans--;
 }
 cout << ans;
 return 0;
}