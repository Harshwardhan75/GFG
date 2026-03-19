

//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        int[] res=largestBST2(root);
        return res[0];
    }
    
    static int[] largestBST2(Node root){
        if(root==null)
            return new int[]{0,Integer.MAX_VALUE,Integer.MIN_VALUE};
        
        int[] left=largestBST2(root.left);
        int[] right=largestBST2(root.right);
        
        if(left[2]<root.data && root.data<right[1]){
            return new int[]{1+left[0]+right[0],
            Math.min(left[1],root.data),
            Math.max(root.data,right[2])};
        }
        else{
            return new int[]{Math.max(left[0],right[0]),
            Integer.MIN_VALUE,
            Integer.MAX_VALUE};
        }
    }
    
}