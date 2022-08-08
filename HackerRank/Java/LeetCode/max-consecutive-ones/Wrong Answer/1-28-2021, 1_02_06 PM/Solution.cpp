// https://leetcode.com/problems/max-consecutive-ones

class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int strike=-1;
        int temp=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
            {
                if(temp>strike)
                    strike=temp;
                temp=0;
            }
            else
                temp++;
        }
        if(strike==-1)return temp;
        return strike;
    }
};