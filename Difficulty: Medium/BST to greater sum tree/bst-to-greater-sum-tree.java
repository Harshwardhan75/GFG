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
} */

class Solution {
    public static void transformTree(Node root) {
        // code here
        int[] max = new int[]{0};
        solve(root,max);
    }
    
    static void solve(Node root,int[] max){
        if(root==null)
            return;
        
        solve(root.right,max);
        int val = root.data;
        root.data = max[0];
        max[0] += val;
        solve(root.left,max);
    }
}