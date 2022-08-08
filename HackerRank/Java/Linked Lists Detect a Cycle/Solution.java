/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<String> set=new HashSet();
    while(head!=null)
    {
        if(set.contains(head.toString()))
            return true;
        set.add(head.toString());
        head=head.next;
    }
    return false;
}
//https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem