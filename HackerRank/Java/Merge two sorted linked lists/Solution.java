

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(0);
        SinglyLinkedListNode ans = head;

        while(head1!=null && head2!= null){
            if(head1.data <= head2.data){
                ans.next = head1;
                
                head1 = head1.next;
            }
            else{
                ans.next = head2;
                head2 = head2.next;
            }
            ans = ans.next;
        }

       
        if(head1!=null){
            ans.next = head1;
        }
        if(head2!=null){
            ans.next = head2;
        }

       
        return head.next;
    }


//https://www.hackerrank.com/challenges/one-week-preparation-kit-merge-two-sorted-linked-lists/problem