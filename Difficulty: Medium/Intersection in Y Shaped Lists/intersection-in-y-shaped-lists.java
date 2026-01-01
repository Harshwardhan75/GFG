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
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1=head1, temp2 = head2;
        
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            
            if(temp1==temp2)
                return temp1;
            
            if(temp1==null)
                temp1=head2;
            if(temp2==null)
                temp2=head1;
        }
        
        return null;
    }
}