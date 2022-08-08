// https://leetcode.com/problems/first-bad-version

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        double jump=n/2;
        int location=jump;
        bool condition=isBadVersion(location);
        while(n>1)
        {
            if(condition && !isBadVersion(location-1))
            {
                if(location == 0)
                    return 1;
                return location;
            }
            jump=ceil(jump/2);
            if(condition)
                location-=jump;
            else
                location+=jump;
            cout<<location;
            condition=isBadVersion(location);
        }
        return 1;
    }
};