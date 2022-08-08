// https://leetcode.com/problems/binary-tree-right-side-view

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int>vect;
    int max_level=-1;
    void printright1(TreeNode* root,int level){
       if(!root)return;
       if(level>max_level){
         vect.push_back(root->val);
         max_level=level;
       }
       printright1(root->right,level+1);
       printright1(root->left,level+1);
    }
    vector<int> rightSideView(TreeNode* root) {
       map<int,vector<int>>m;
       printright1(root,0); 
       return vect;
    }
};