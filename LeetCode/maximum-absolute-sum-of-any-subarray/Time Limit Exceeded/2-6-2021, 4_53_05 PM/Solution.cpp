// https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray

class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int max=nums[0];
        for(int i=0;i<nums.size();i++)
        {
            int tmax=nums[i];
            for(int j=i+1;j<nums.size();j++)
            {
                tmax+=nums[j];
                if(abs(tmax)>max)
                    max=abs(tmax);
            }
        }
        return max;
    }
};