/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node root, int k) {
        // code here
        Node temp = root;
        int current = 0;
        
        while(temp!=null){
            if(temp.left==null){
                current++;
                if(current == k)
                    return temp.data;
                temp = temp.right;
            }    
            else{
                Node left = temp.left;
                while(left.right!=null && left.right!=temp) left = left.right;
                
                if(left.right==null){
                    left.right = temp;
                    temp = temp.left;
                }
                else{
                    current++;
                    if(current == k)
                        return temp.data;
                    temp=temp.right;
                }
            }
        }
        
        return -1;
    }
}