

/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        return new ArrayList<>(
            Arrays.asList(Predecessor(root,key),Successor(root,key))
            );
    }
    
    Node Successor(Node temp,int key){
        Node result=null;
        
        while(temp!=null){
            if(temp.data>key){
                result=temp;
                temp=temp.left;
            }
            else
                temp=temp.right;
        }
        
        return result;
    }
    
    Node Predecessor(Node temp,int key){
        Node result=null;
        
        while(temp!=null){
            if(temp.data<key){
                result=temp;
                temp=temp.right;
            }
            else
                temp=temp.left;
        }
        
        return result;
    }
}