// https://leetcode.com/problems/first-bad-version

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int temp=n/2;
        while(n>1)
        {
            bool condition=isBadVersion(temp);
            if(condition && !isBadVersion(temp-1))
                return temp;
            if(condition)
                temp/=2;
            else
                temp+=temp/2;
        }
        return 1;
    }
};