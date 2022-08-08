// https://leetcode.com/problems/valid-anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        char []ar1 = s.toCharArray();
        Arrays.sort(ar1);
        char []ar2 = t.toCharArray();
        Arrays.sort(ar2);
        
        if(Arrays.equals(ar1,ar2))
            return true;
        return false;
    }
}