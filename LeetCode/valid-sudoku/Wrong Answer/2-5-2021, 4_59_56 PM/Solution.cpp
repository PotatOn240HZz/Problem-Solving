// https://leetcode.com/problems/valid-sudoku

class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<9;i++)
        {
            int x [10]={0,0,0,0,0,0,0,0,0,0};
            int y [10]={0,0,0,0,0,0,0,0,0,0};
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    int num=(int)board[i][j]-48;
                    x[num]++;
                    if(x[num]==2)
                        return false;
                }
                if(board[j][i] != '.')
                {
                    int num=(int)board[j][i]-48;
                    y[num]++;
                    if(y[num]==2)
                        return false;
                }
                if(i%3==0 && j%3==0)
                {
                    int x1 [10]={0,0,0,0,0,0,0,0,0,0};
                    for(int k=i;k<i+3;k++)
                    {
                        for(int l=j;l<j+3;l++)
                        {
                            if(board[l][j] != '.')
                            {
                                int num=(int)board[l][j]-48;
                                x1[num]++;
                                if(x1[num]==2)
                                    return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
};