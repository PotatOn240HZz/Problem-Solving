// https://leetcode.com/problems/reverse-string

class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<Math.floor(s.length/2.0);i++)
        {
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }
    }
}