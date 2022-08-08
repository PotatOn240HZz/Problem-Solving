

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode n1 = head1;
        while(n1!=null)
            {
                SinglyLinkedListNode n2 = head2;
                while(n2!=null)
                    {
                        n2=n2.next;
                        if(n1==n2)
                            return n1.data;
                    }
                n1=n1.next;
            }
            return -1;
    }


//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem