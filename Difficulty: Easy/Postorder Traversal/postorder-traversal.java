/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            Node node = st.pop();
            result.add(node.data);
            
            if(node.left!=null)
                st.push(node.left);
                
            if(node.right!=null)
                st.push(node.right);
        }
        
        Collections.reverse(result);
        return result;
    }
}