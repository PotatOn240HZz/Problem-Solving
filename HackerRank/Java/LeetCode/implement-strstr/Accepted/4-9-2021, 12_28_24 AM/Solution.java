// https://leetcode.com/problems/implement-strstr

class Solution {
    public int strStr(String haystack, String needle) {
        if((haystack.length()==0 && needle.length()==0) || needle.length()==0)
            return 0;
        for(int i=0;i<haystack.length();i++)
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int p=i;
                for(int j=0;j<needle.length() && p<haystack.length() && haystack.charAt(p)==needle.charAt(j);j++,p++)
                    if(j==needle.length()-1)
                        return p-j;
            }
        return -1;
    }
}