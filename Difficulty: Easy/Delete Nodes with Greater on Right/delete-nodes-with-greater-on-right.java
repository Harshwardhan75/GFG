/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        // code here
        if(head==null || head.next==null)
            return head;
        
        Node next = compute(head.next);
        
        if(head.data<next.data)
            return next;
        
        head.next =next;
        return head;
    }
}