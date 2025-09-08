/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head==null || head.next==null)
            return head;
        
        Node middle = findMiddle(head);
        Node right = middle.next;
        Node left = head;
        middle.next=null;
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left,right);
    }
    
    Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    Node merge(Node left,Node right){
        Node head = new Node(-1);
        Node temp = head;
        
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left = left.next;
            }
            else{
                temp.next=right;
                right = right.next;
            }
            
            temp=temp.next;
        }
        
        if(left!=null)
            temp.next=left;
        if(right!=null)
            temp.next=right;
        
        return head.next;
    }
}