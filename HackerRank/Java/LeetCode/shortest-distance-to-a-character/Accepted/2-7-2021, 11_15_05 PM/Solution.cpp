// https://leetcode.com/problems/shortest-distance-to-a-character

class Solution {
public:
    vector<int> shortestToChar(string s, char c) {
        vector <int> temp;
        temp.resize(s.size());
        int value=0;
        int location=-1;
        if(s.at(s.size()-1)==c)
        {
            temp[s.size()-1]=0;
            location=s.size()-1;
        }
        else
            temp[s.size()-1]=1;
        
        for(int i=s.size()-2;i>=0;i--)
        {
            if(s.at(i)==c)
            {
                temp[i]=0;
                if(location!=-1)
                {
                    for(int j=0;j<ceil((location-i)/2.0);j++)
                        temp[i+j]=j;
                }
                else
                {
                    for(int j=i+1;j<s.size();j++)
                        temp[j]=temp[j-1]+1;
                }
                location=i;
            }
            else
                temp[i]=temp[i+1]+1;
        }
        return temp;
    }
};