/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int distCandy(Node root) {
        // code here
        int[] move = new int[1];
        dfs(root,move);
        return move[0];
    }
    
    int dfs(Node node,int[] move){
        if(node==null)
            return 0;
        
        int left = dfs(node.left,move);
        int right = dfs(node.right,move);
        
        move[0] += Math.abs(left) + Math.abs(right);
        return node.data + left + right - 1;
    }
}