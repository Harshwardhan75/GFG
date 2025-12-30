/*
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
    
    Node reverse(Node root){
        if(root==null || root.next == null)
            return root;
        
        Node newHead = reverse(root.next);
        root.next.next = root;
        root.next = null;
        return newHead;
    }
    
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        int carry = 0;
        
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        while(head1!=null || head2!=null){
            int sum = (head1!=null?head1.data:0) + 
                        (head2!=null?head2.data:0) + 
                        carry;
            
            carry = sum / 10;
            temp.next = new Node(sum%10);
            
            if(head1!=null)
                head1=head1.next;
            if(head2!=null)
                head2=head2.next;
            temp = temp.next;
        }
        
        if(carry==1){
            temp.next = new Node(carry);
        }
        
        dummy = reverse(dummy.next);
        
        while(dummy!=null && dummy.data == 0)
            dummy = dummy.next;
        
        return dummy;
    }
}