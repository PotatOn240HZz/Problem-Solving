

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
        
        DoublyLinkedListNode temp =llist;
        while(temp.next!=null && temp.next.data<data)
            temp=temp.next;
        if(llist==temp && temp.data>data)
            {
                DoublyLinkedListNode nn =new DoublyLinkedListNode(data);
                nn.next=llist;
                llist.prev=nn;
                nn.prev=null;
                System.out.print("lol");
                return nn;
            }
        else if(temp.next==null)
           {
               DoublyLinkedListNode nn =new DoublyLinkedListNode(data);
               temp.next=nn;
               nn.prev=temp;
               nn.next=null;
           }
        else
            {
                DoublyLinkedListNode nn =new DoublyLinkedListNode(data);
                nn.next=temp.next;
                temp.next.prev=nn;
                nn.prev=temp;
                temp.next=nn;
            }
        return llist;
    }



//https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem