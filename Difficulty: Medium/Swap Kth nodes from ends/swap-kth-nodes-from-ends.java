/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        Node first = null;
        Node last = null;
        Node temp = head;
        
        while(k>0){
            if(k==1){
                first = temp;
            }
            
            if(temp==null)
                return head;
            temp = temp.next;
            k--;
        }
        
        last = head;
        while(temp!=null){
            last = last.next;
            temp = temp.next;
        }
        
        if(first!=null && last!=null){
            int t = first.data;
            first.data = last.data;
            last.data = t;
        }
        
        return head;
    }
}
