/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isSymmetric(Node root) {
        // Code here
        return isSymmetric(root.left,root.right);
    }
    
    boolean isSymmetric(Node a,Node b){
        if(a==null || b==null)
            return a==b;
        
        return a.data==b.data && 
            isSymmetric(a.left,b.right) &&
            isSymmetric(a.right,b.left);
    }
}