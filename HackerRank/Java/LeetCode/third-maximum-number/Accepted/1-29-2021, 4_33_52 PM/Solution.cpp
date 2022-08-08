// https://leetcode.com/problems/third-maximum-number

class Solution {
public:
    int thirdMax(vector<int>& nums) {
        vector<int>temp=nums;
        sort(temp.begin(),temp.end());
        for (int i = 0; i < temp.size() && temp.size()!=i+1; i++)
            if (temp[i] == temp[i+1])
            {
                temp.erase(temp.begin() + i);
                i--;
            }
        if(temp.size() >= 3)
            return temp[(temp.size()-3)];
        return temp[(temp.size()-1)];
    }
};