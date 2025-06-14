/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        boolean reverse=false;
        
        while(!que.isEmpty()){
            int size=que.size();
            ArrayList<Integer> arr=new ArrayList<>();
            
            for(int i=1;i<=size;i++){
                Node temp=que.poll();
                arr.add(temp.data);
                
                if(temp.left!=null) que.offer(temp.left);
                if(temp.right!=null) que.offer(temp.right);
            }
            
            if(reverse)
                Collections.reverse(arr);
            
            reverse=!reverse;
            
            for(int x: arr)
                result.add(x);
        }
        
        return result;
    }
}