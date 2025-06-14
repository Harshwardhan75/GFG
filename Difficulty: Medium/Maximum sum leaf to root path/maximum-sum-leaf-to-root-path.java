// User function Template for Java

class Solution {
    public static int maxPathSum(Node root) {
        // code here
        int[] maxi=new int[1];
        
        return solve(root);
    }
    
    static int solve(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        
        if(root.left==null && root.right==null)
            return root.data;
        
        int left=solve(root.left);
        int right=solve(root.right);
        
        return Math.max(left,right)+root.data;
    }
}