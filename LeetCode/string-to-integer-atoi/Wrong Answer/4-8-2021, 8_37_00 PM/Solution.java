// https://leetcode.com/problems/string-to-integer-atoi

class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
            return 0;
        int index=0;
        while(s.length()-1!=index && s.charAt(index)== 32)
            index++;
        int end=index;
        if(s.charAt(index)=='+')
            index++;
        else if(s.charAt(end)=='-')
            end++;
        if(end==s.length() || s.charAt(end)<'0' || s.charAt(end)>'9')
            return 0;
        while(end!=s.length() && s.charAt(end)>=48 && s.charAt(end)<=57)
            end++;
        s=s.substring(index,end);
        if(Double.parseDouble(s) >= 2147483647)
            return 2147483647;
        if(Double.parseDouble(s) <= -2147483648)
            return -2147483648;
        return Integer.parseInt(s);
    }
}