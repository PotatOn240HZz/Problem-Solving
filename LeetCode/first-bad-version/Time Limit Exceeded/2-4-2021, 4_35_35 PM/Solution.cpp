// https://leetcode.com/problems/first-bad-version

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int temp=n/2;
        int ptemp=0;
        while(n>1)
        {
            if(temp==ptemp)
                temp++;
            bool condition=isBadVersion(temp);
            if(condition && !isBadVersion(temp-1))
                return temp;
            if(condition)
                temp=ceil(temp/2);
            else
                temp+=ceil(temp/2);
            ptemp=temp;
        }
        return 1;
    }
};