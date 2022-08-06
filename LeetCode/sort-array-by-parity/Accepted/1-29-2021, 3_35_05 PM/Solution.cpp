// https://leetcode.com/problems/sort-array-by-parity

class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& A) {
        if(A.empty())return A;
        int counter=0;
        for(int i=0;i<A.size()-counter-1;i++)
            if(A[i]%2==1)
            {
                A.push_back(A[i]);
                A.erase(A.begin() + i);
                counter++;
                i--;
                cout<<"hi";
            }
        return A;
    }
};