// https://leetcode.com/problems/add-two-numbers

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* temp = new ListNode();
        int carry=0;
        if(l1->val+l2->val+carry>9)
        {
            temp=new ListNode(l1->val+l2->val-10+carry);
            if(carry==0)
                carry++;
        }
        else
        {
            temp=new ListNode(l1->val+l2->val+carry);
            carry=0;
        }
        ListNode* head = temp;
        
        while(l1->next!=NULL && l2->next!=NULL)
        {
            l1=l1->next;
            l2=l2->next;
            if(l1->val+l2->val+carry>9)
            {
                temp->next=new ListNode(l1->val+l2->val+carry-10);
                if(carry==0)
                    carry++;
            }
            else
            {
                temp->next=new ListNode(l1->val+l2->val+carry);
                carry=0;
            }
            temp=temp->next;
        }
        while(l1->next==NULL && l2->next!=NULL)
        {
            l2=l2->next;
            if(l2->val+carry>9)
            {
                temp->next=new ListNode(l2->val+carry-10);
                if(carry==0)
                    carry++;
            }
            else
            {
                temp->next=new ListNode(l2->val+carry);
                carry=0;
            }
            temp=temp->next;
        }
        while(l1->next!=NULL && l2->next==NULL)
        {
            l1=l1->next;
            if(l1->val+carry>9)
            {
                temp->next=new ListNode(l1->val+carry-10);
                if(carry==0)
                    carry++;
            }
            else
            {
                temp->next=new ListNode(l1->val+carry);
                carry=0;
            }
            temp=temp->next;
        }
        if(carry != 0)
        {
            temp->next=new ListNode(carry);
        }
        return head;
    }
};