/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int nodeSum(Node root, int l, int r) {
        // code here
        if(root==null){
            return 0;
        }
        
        int left = nodeSum(root.left,l,r);
        int right = nodeSum(root.right,l,r);
        
        if(l<=root.data && root.data<=r) 
            return left + right + root.data;
        else
            return left + right;
    }
}
