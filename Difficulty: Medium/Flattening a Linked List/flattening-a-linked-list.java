/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        if(root==null || root.next==null)
            return root;
        
        Node next = flatten(root.next);
        
        return merge(root,next);
    }
    
    Node merge(Node a,Node b){
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        while(a!=null && b!=null)
        {
            if(a.data<b.data){
                temp.bottom = a;
                a=a.bottom;
            }
            else{
                temp.bottom = b;
                b=b.bottom;
            }
            
            temp = temp.bottom;
        }
        
        if(a!=null)
            temp.bottom = a;
        else
            temp.bottom = b;
            
        return dummy.bottom;
    }
}