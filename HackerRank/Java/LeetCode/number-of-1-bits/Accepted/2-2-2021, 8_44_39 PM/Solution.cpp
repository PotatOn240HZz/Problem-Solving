// https://leetcode.com/problems/number-of-1-bits

class Solution {
public:
    int hammingWeight(uint32_t n) {
    int ans = 0;
    double temp = 1;
    bool condition = true;
    if(n<0) return -1;
    while (n != 0)
    {
        temp *= 2;
        if (temp >= n && condition)
        {
            if (temp == 2147483648)
            {
                condition == false;
            }
            if (temp != n)
                n -= temp / 2;
            else
                n -= temp;
            ans++;
            temp = 1;
        }
        else if (temp >= n && !condition)
        {
            if (temp != n)
                n -= temp / 2;
            else
                n -= temp;
            
            temp = 1;
        }
        else if(!condition)
            ans++;
    }
    return ans;
}
};