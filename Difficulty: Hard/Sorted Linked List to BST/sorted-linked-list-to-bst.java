// User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}*/

class Solution {
    public TNode sortedListToBST(LNode head) {
        // code here
        if(head == null)
            return null;
        
        if(head.next==null)
            return new TNode(head.data);
            
        LNode middle = findMiddle(head);
        if(middle==null)
            return null;
            
        LNode left = head;
        LNode right = middle.next!=null?middle.next.next:null;
        
        TNode root = middle.next!=null? new TNode(middle.next.data):null;
        
        middle.next = null;
        
        root.left = sortedListToBST(left);
        root.right = sortedListToBST(right);
        
        return root;
    }
    
    LNode findMiddle(LNode head){
        if(head.next==null)
            return head;
            
        LNode slow = head,fast = head.next.next;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}