// https://leetcode.com/problems/power-of-three

class Solution {
public:
    bool isPowerOfThree(int n) {
        for(int i=1;i<=n;i*=3)
            if(n==i)
                return true;
        return false;
    }
};