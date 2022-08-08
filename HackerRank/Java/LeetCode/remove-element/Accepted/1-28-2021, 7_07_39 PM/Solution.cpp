// https://leetcode.com/problems/remove-element

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int counter = 0;
        if(nums.size()==1 && nums.front()==val)counter++;
        for (int i = 0; i <= (nums.size()-counter-1) && nums.size() !=1 && counter!=nums.size(); i++)
        {
            if (nums[i] == val)
            {
                counter++;
                if(i!=nums.size()-1)
                {
                    for (int j = i; j < nums.size()-1 ; j++)
                        nums[j] = nums[j + 1];
                    i--;
                }
            }
        }
            return (nums.size()-counter);
    }
};