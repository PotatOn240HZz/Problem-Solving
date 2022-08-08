// https://leetcode.com/problems/move-zeroes

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int counter=0;
        for (int i = 0; i < nums.size()-counter; i++)
            if (nums[i] == 0)
            {
                nums[nums.size()]=0;
                nums.erase(nums.begin() + i);
                counter++;
                i--;
            }
    }
};