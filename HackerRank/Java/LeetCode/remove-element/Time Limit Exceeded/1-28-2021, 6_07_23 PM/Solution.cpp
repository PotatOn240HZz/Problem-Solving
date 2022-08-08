// https://leetcode.com/problems/remove-element

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int counter = 0;
        for (int i = 0; i <= nums.size()-1; i++)
        {
            if (nums[i] == val)
            {
                counter++;
                for (int j = i; j < nums.size() -1; j++)
                    nums[j] = nums[j + 1];
                if(nums.size() != 1)
                    i--;
            }
        }
            return (nums.size()-counter);
    }
};