// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        double container=0;
        while(x!=0)
        {
            container*=10;
            container+=(x%10);
            x/=10;
        }
        if(Math.abs(container) > 2147483648.0)
            return 0;
        return (int)container;
    }
}