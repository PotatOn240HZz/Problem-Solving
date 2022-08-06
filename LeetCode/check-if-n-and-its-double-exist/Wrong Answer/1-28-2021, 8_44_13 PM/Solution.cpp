// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        for(int i=0;i<=arr.size()-1;i++)
            for(int j=0;j<=arr.size()-1;j++)
                if(abs(arr[i])==abs(arr[j]*2) && i!=j)
                    return true;
        return false;
    }
};