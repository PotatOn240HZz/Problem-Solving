// https://leetcode.com/problems/implement-strstr

class Solution {
    public int strStr(String haystack, String needle) {
        if((haystack.length()==0 && needle.length()==0) || needle.length()==0)
            return 0;
        for(int i=0;i<haystack.length();i++)
            if(haystack.charAt(i)==needle.charAt(0))
                for(int j=0;j<needle.length() && i<haystack.length() && haystack.charAt(i)==needle.charAt(j);j++,i++)
                    if(j==needle.length()-1)
                        return i-j;
        return -1;
    }
}