// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());
        int range1=0,range2=0;
        vector <int> ans;
        while(range1<nums1.size() && range2<nums2.size())
        {
            if(nums1[range1]==nums2[range2])
            {
                ans.push_back(nums2[range2]);
                range1++;
                range2++;
            }
            else if(nums1[range1]>nums2[range2])
                range2++;
            else
                range1++;
        }
        return ans;
    }
};