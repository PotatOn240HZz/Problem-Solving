// https://leetcode.com/problems/power-of-three

class Solution {
public:
    bool isPowerOfThree(int n) {
        for(double i=1;i<=n;i*=3)
            if(n==i)
                return true;
        return false;
    }
};