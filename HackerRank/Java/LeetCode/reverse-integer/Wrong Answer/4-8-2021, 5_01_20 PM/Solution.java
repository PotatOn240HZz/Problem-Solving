// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        int container=0;
        while(x!=0)
        {
            container*=10;
            container+=(x%10);
            x/=10;
        }
        return container;
    }
}