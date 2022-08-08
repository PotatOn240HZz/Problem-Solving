
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
        DoublyLinkedListNode temp;
        DoublyLinkedListNode itr = llist;

        while (itr!=null) {
            temp = itr.next; //reserve the next
            itr.next = itr.prev; //swap prev and next
            itr.prev = temp;
            llist = itr; //we do not know if there is a next element 
            itr = temp; //iterate to next
        }

        return llist;
    }



//https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem