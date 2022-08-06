// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        double x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            x+=s.charAt(i);
            y+=t.charAt(i);
        }
        if(y==x)
            return true;
        return false;
    }
}