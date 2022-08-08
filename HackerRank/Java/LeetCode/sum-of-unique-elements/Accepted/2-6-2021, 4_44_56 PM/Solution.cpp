// https://leetcode.com/problems/sum-of-unique-elements

class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            if(i!=nums.size()-1 && nums[i]==nums[i+1])
                while(i!=nums.size()-1 && nums[i]==nums[i+1])
                    i++;
            else
                ans+=nums[i];
        }
        return ans;
    }
};