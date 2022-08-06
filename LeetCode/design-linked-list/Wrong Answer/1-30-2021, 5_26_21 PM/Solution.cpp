// https://leetcode.com/problems/design-linked-list

struct node
{
   int val;
   struct node *next;
};
class MyLinkedList {
public:
    node *head,*tail;
    int counter;
public:
    /** Initialize your data structure here. */
    MyLinkedList() {
        head = NULL;
        tail = NULL;
        counter=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    int get(int index) {
        if(head==NULL || counter < index+1)
            return -1;
        node *temp=head;
        for(int i=0;i<index;i++)
            temp=temp->next;
        return temp->val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    void addAtHead(int val) {
        if(head==NULL)
        {
            node* temp=new node;
            temp->val=val;
            head=tail=temp;
        }
        else
        {
            node *temp=new node;
            temp->next=head;
            temp->val=val;
            head=temp;
        }
        counter++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    void addAtTail(int val) {
        if(head==NULL)
        {
            node* temp=new node;
            temp->val=val;
            head=tail=temp;
        }
        else
        {
            node *temp=new node;
            tail->next=temp;
            temp->next=NULL;
            temp->val=val;
            tail=temp;
        }
        counter++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    void addAtIndex(int index, int val) {
        if(head==NULL)
        {
            node* temp=new node;
            temp->val=val;
            head=tail=temp;
            counter++;
        }
        else if(index+1>counter);
        else if(index==0)
            addAtHead(val);
        else if (index==counter)
            addAtTail(val);
        else
        {
            node *temp=head;
            for(int i=1;i<index;i++)            //
                temp=temp->next;
            node *nn=new node;
            nn->next=temp->next;
            temp->next=nn;
            nn->val=val;
            counter++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    void deleteAtIndex(int index) {
        if(index+1>counter || head==NULL);
        else if(head==tail)
        {
            head=tail=NULL;
            counter--;
        }
        else if(index ==0)
        {
            head=head->next;
            counter--;
        }
        else if(index+1==counter)
        {
            node *temp=new node;
            for(int i=3;i<counter;i++)                      //
                temp=temp->next;
            temp->next=NULL;
            tail=temp;
            counter--;
        }
        else
        {
            node* temp=head;
            for(int i=1;i<index;i++)
                temp=temp->next;
            temp->next=temp->next->next;
            counter--;
        }
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */