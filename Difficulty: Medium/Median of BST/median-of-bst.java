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
    class BSTIterator{
        Stack<Node> st;
        boolean reverse;
        
        BSTIterator(Node root,boolean reverse){
            st = new Stack<>();
            this.reverse = reverse;
            push(root);    
        }
        
        void push(Node root){
            Node temp = root;
            while(temp!=null){
                st.push(temp);
                if(reverse)
                    temp = temp.right;
                else
                    temp = temp.left;
            }
        }
        
        int peek(){
            return st.peek().data;
        }
        
        int next(){
            Node node = st.pop();
            if(reverse)
                push(node.left);
            else
                push(node.right);
            
            return node.data;
        }
    }
    public int findMedian(Node root) {
        // Code here
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        
        while(l.peek()<r.peek()){
            l.next();
            r.next();
        }
        
        return r.peek();
    }
}