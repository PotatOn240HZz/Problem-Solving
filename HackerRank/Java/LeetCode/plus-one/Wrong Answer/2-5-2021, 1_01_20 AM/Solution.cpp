// https://leetcode.com/problems/plus-one

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        digits[digits.size()-1]++;
        if(digits[digits.size()-1]==10)
        {
            for(int i=digits.size()-1;i>=0 && digits[i]<=10;i--)
            {
                if(i!=digits.size()-1)
                    digits[i]++;
                if(digits[i]==10)
                    digits[i]=0;
                if(i==0 && digits[0]==0)
                {
                    vector <int> temp;
                    temp.push_back(1);
                    temp.insert(temp.end(), digits.begin(), digits.end());
                    digits=temp;
                }
            }
        }
        return digits;
    }
};