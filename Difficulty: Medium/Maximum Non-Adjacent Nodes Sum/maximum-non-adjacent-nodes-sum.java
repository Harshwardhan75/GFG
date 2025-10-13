/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public int getMaxSum(Node root) {
        // code here
        int[] result = find(root);
        return Math.max(result[0],result[1]);
    }
    
    int[] find(Node root){
        if(root == null)
            return new int[]{0,0};
        
        int[] left = find(root.left);
        int[] right = find(root.right);
        
        int[] result = new int[]{
            root.data+left[1]+right[1],
            Math.max(left[0],left[1]) + Math.max(right[0],right[1])
        };
        
        return result;
    }
}