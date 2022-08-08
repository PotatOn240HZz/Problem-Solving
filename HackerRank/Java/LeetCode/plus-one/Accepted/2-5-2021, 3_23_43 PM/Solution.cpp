// https://leetcode.com/problems/plus-one

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
            int carry=1;
            for(int i=digits.size()-1;i>=0 && carry!=0;i--)
            {
                digits[i]+=carry;
                    carry--;
                if(digits[i]==10)
                {
                    carry=1;
                    digits[i]=0;
                }
            }
        if(carry!=0)
        {
            vector <int> temp;
            temp.push_back(1);
            temp.insert(temp.end(),digits.begin(),digits.end());
            digits=temp;
        }
        return digits;
    }
};