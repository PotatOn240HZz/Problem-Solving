// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String case1=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            int match=0;
            while(match<case1.length() && match<strs[i].length() && case1.charAt(match)==strs[i].charAt(match))
            {
                match++;
            }
            case1=case1.substring(0, match);
        }
        return case1;
    }
}