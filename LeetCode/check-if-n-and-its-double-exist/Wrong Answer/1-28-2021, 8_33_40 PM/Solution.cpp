// https://leetcode.com/problems/check-if-n-and-its-double-exist

class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        for(int i=0;i<=arr.size()-1;i++)
            for(int j=0;j<=arr.size()-1;j++)
                if(i!=j && arr[i]==arr[j]*2 && (0<=arr[i] && 0<=arr[j]))
                    return true;
        return false;
    }
};