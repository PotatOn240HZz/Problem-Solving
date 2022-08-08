// https://leetcode.com/problems/rotate-array

class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> vec;
        vec.resize(nums.size());
        int size=nums.size();
        for(int i=0;i<k;i++)
        {
            vec={};
            vec.push_back(nums[nums.size()-1]);
            nums.pop_back();
            vec.insert(vec.end(), nums.begin(), nums.end());
            nums=vec;
        }
    }
};