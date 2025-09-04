/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        Node prevLast=null;
        Node temp = head;
        
        while(temp!=null){
            Node KthNode = findKthNode(temp,k);
            Node nextNode = KthNode!=null?KthNode.next:null;
            if(KthNode!=null)
                KthNode.next = null;
                
            KthNode = reverse(temp);
            
            if(temp==head){
                head = KthNode;
            }
            else{
                prevLast.next = KthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        
        return head;
    }
    
    Node findKthNode(Node node,int k){
        while(k-->1 && node!=null){
            node=node.next;
        }
        
        return node;
    }
    
    Node reverse(Node node){
        if(node==null || node.next==null)
            return node;
        
        Node newHead = reverse(node.next);
        
        node.next.next=node;
        node.next = null;
        
        return newHead;
    }
}