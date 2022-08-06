// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector <int> temp;
        temp.resize(nums.size(),0);
        for(int i=0;i<nums.size();i++)
                temp[nums[i]-1]=1;
        vector <int> temp2;
        for(int i=0;i<temp.size();i++)
            if(temp[i]==0)
                temp2.push_back(i+1);
        temp.clear();
        return temp2;
    }
};