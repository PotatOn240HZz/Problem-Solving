// Time in milliseconds: 31

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
 int main()
{
    double times,cost,tsum = 0;
    cin >> times >> cost;
    const int size = times;
    int ar [1000];
    int nsteps = 0;
    for (int t = 0; t < times; t++)
    {
        cin >> ar[t];
        tsum += ar[t];
    }
    if (tsum < cost)
        cout << "-1"<<endl;
    else if (times == 1)
        cout << "0" << endl;
    else
    {
        for (int i = 0; i < times; i++)
        {
            double sum = 0;
            int steps = 0;
            for (int j = i; j < times; j++)
                if (sum < cost)
                {
                    sum += ar[j];
                    steps++;
                }
            if (i == 0)nsteps = steps;
            if (sum >= cost && steps < nsteps) { nsteps = steps; }
        }
        cout<<(int)nsteps<<endl;
    }
 return 0;
}