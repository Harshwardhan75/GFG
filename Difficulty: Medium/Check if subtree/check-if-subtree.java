/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSubTree(Node root1, Node root2) {
        // code here
        if(root1==null)
            return false;
        
        boolean result = false;
        if(root1.data==root2.data)
            result = find(root1,root2);
        
        if(result)
            return result;
        
        return isSubTree(root1.left,root2) | isSubTree(root1.right,root2);
    }
    
    boolean find(Node a,Node b){
        if(b==null)
            return true;
        
        if(a==null)
            return false;
        
        if(a.data!=b.data)
            return false;
        
        return find(a.left,b.left) & find(a.right,b.right);
    }
}