/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zeroHead= new Node(-1);
        Node oneHead= new Node(-1);
        Node twoHead= new Node(-1);
        
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        
        Node temp = head;
        
        while(temp!=null){
            if(temp.data==0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            
            temp = temp.next;
        }
        
        two.next = null;
        one.next = twoHead.next;
        zero.next = oneHead.next;
        
        return zeroHead.next;
    }
}