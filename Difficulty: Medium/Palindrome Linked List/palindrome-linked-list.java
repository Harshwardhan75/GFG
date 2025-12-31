/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        
        System.out.println();
    }
    
    public boolean isPalindrome(Node head) {
        // code here
        Node slow,fast;
        slow = fast = head;
        Node prev = null;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        // prev.next = null;
        slow = reverse(slow);
        fast = head;
        
        // print(slow);
        // print(fast);
        
        while(slow!=null && fast!=null){
            if(slow.data!=fast.data)
                return false;
            
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }
}