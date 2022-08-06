// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        for (int i = 0; i <= nums.size()-1 && nums.size()!=i+1; i++)
        {
            if (nums[i] == nums[i+1])
            {
                nums.erase(nums.begin() + i);
                i--;
            }
        }
            return (nums.size());
    }
};