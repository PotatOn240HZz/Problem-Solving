// https://leetcode.com/problems/height-checker

class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector <int> temp;
        temp = heights; 
        sort(temp.begin(),temp.end());
        int temp2=0;
        for(int i=0;i<heights.size();i++)
            if(temp[i]!=heights[i])
                temp2++;
        return temp2;
    }
};