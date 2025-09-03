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
        Node last = head;
        int size = 1;
        
        while(last.next!=null){
            last = last.next;
            size++;
        }
        
        Node first = head;
        
        size/=2;
        
        while(size-->0){
            int temp = last.data;
            last.data = first.data;
            first.data = temp;
            
            first = first.next;
            last = last.prev;
        }
        
        return head;
    }
}