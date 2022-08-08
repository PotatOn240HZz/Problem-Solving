// https://leetcode.com/problems/sum-of-unique-elements

class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int ans=0;
        if(nums.size()==1)
            return nums[0];
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i]==nums[i+1])
                i++;
            else
                ans+=nums[i];
        }
        if(nums.size()!=1 && nums[nums.size()-1]!=nums[nums.size()-2])
            ans+=nums[nums.size()-1];
        return ans;
    }
};