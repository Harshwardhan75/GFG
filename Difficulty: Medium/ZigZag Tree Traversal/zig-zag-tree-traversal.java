/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        
        boolean flag = true;
        while(!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i=1;i<=size;i++){
                Node node = que.poll();
                temp.add(node.data);
                
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
            }
            
            if(!flag)
                Collections.reverse(temp);
            
            result.addAll(temp);
            flag = !flag;
        }
        
        return result;
    }
}