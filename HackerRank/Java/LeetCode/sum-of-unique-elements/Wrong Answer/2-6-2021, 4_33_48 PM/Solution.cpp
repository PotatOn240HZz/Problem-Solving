// https://leetcode.com/problems/sum-of-unique-elements

class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        sort(nums.begin(), nums.end()); 
        nums.erase(unique(nums.begin(), nums.end()), nums.end());
        int ans=0;
        for(int i=0;i<nums.size();i++)
            ans+=nums[i];
        return ans;
    }
};