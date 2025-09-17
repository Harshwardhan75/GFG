/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null)
            return head;
        
        Node newHead = reverse(head.next);
        
        Node temp = head.next;
        head.next = head.prev;
        head.prev = temp;
        
        if(head.prev==null)
            return head;
        
        return newHead;
    }
}