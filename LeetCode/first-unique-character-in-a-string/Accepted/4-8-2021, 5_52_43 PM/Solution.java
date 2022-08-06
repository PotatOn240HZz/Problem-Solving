// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        int [][] x=new int [26][2];
        for(int i=0;i<s.length();i++)
        {
            x[s.charAt(i)-97][0]++;
            x[s.charAt(i)-97][1]=i;
        }
        int min=-1;
        for(int i=0;i<26;i++)
        {
            if(x[i][0]==1 && (x[i][1]<min || min==-1))
                min=x[i][1];
        }
        if(min==-1)
            return -1;
        return min;
    }
}