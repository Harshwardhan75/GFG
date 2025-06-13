/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        return find(root)!=-1;
    }
    
    int find(Node root){
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return root.data;
        
        int left = find(root.left);
        int right = find(root.right);
        
        if(left+right==root.data)
            return left+right+root.data;
        else
            return -1;
    }
}