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
    Map<Integer,Integer> postOrder = new HashMap<>();
    Map<Integer,Integer> preOrder = new HashMap<>();
    public Node constructTree(int[] pre, int[] post) {
        // code here
        for(int i=0;i<post.length;i++){
            postOrder.put(post[i],i);
            preOrder.put(pre[i],i);
        }
        
        return solve(pre,0,pre.length-1,post,post.length-1,0);
    }
    
    Node solve(int[] pre,int preStart,int preEnd,int[] post,int postStart,int postEnd){
        if(preStart>preEnd || postStart<postEnd)
            return null;
            
        Node newNode = new Node(pre[preStart]);
        
        if(postStart-1>=0 && preStart+1<pre.length)
            newNode.left = solve(pre,preStart+1,preOrder.get(post[postStart-1])-1,
                            post,postOrder.get(pre[preStart+1]),postEnd);
                            
        if(postStart-1>=0 && preStart+1<pre.length)
            newNode.right = solve(pre,preOrder.get(post[postStart-1]),preEnd,
                        post,postStart-1,postOrder.get(pre[preStart+1])+1);
        
        return newNode;
    }
}