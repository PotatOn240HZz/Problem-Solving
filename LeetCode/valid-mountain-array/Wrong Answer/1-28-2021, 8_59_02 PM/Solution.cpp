// https://leetcode.com/problems/valid-mountain-array

class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        if(arr.size()<=3)
            return false;
        bool condition=false;
        for(int i=0;i< arr.size()-1;i++)
        {
            if(arr[i]==arr[i+1])
                return false;
            else if(arr[i]>arr[i+1] && condition==false)
                condition=true;
            else if(condition==true && arr[i]<arr[i+1])
                return false;
        }
        return true;
    }
};