// https://leetcode.com/problems/rotate-image

class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n=matrix.size()-1;
        for(int i=0;i<n;i++)
        {
            cout<<"hi";
            cout<<i<<" "<<n<<endl;
            for(int j=i;j<n;j++)
            {
                  int temp=matrix[j][n];
                matrix[j][n]=matrix[i][j];
                  int temp2=matrix[n][n-j+i];
                matrix[n][n-j+i]=temp;
                  temp=matrix[n-j+i][i];
                matrix[n-j+i][i]=temp2;
                matrix[i][j]=temp;
            }
            n--;
        }
    }
};