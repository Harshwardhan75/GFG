/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean isDeadEnd(Node root) {
        // Code here.
        return solve(root,0,Integer.MAX_VALUE);
    }
    
    static boolean solve(Node root,int min,int max){
        if(root==null)
            return false;
        
        if(root.left==null && root.right==null)
        {
            if(min+1==root.data && root.data+1==max)
                return true;
            
            return false;
        }
        
        return solve(root.left,min,root.data) |
                solve(root.right,root.data,max);
    }
}