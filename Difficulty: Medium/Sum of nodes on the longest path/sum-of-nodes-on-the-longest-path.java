/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        int max= 0;
        
        while(!que.isEmpty()){
            int size=que.size();
            max=0;
            for(int i=1;i<=size;i++){
                Node node=que.poll();
                max=Math.max(max,node.data);
                if(node.left!=null)
                {
                    //Input tree ka data badalna galat baat
                    node.left.data+=node.data;
                    que.offer(node.left);
                }
                
                if(node.right!=null)
                {
                    //Input tree ka data badalna galat baat
                    node.right.data+=node.data;
                    que.offer(node.right);
                }
            }
        }
        
        return max;
    }
}