    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode prev =llist;
        for(int i=0;i<position-1;i++)
            prev=prev.next;
        if(position==0)
            {
                SinglyLinkedListNode nn =new SinglyLinkedListNode(data);
                nn.next=llist;
                return nn;
            }
        
        else if(prev.next==null)
           {
               SinglyLinkedListNode nn =new SinglyLinkedListNode(data);
               prev.next=nn;
               nn.next=null;
           }
        else
            {
                SinglyLinkedListNode nn =new SinglyLinkedListNode(data);
                nn.next=prev.next;
                prev.next=nn;
            }
        return llist;
    }

//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem