//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.math.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            int target = Integer.parseInt(br.readLine().trim());

            Solution T = new Solution();
            boolean ans = T.findTarget(root, target);
            if (ans)
                System.out.println(1);
            else
                System.out.println(0);
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    
    static class BSTIterator{
        Stack<Node> st;
        boolean reverse;
        
        BSTIterator(Node root,boolean reverse){
            this.reverse=reverse;
            st=new Stack<>();
            pushAll(root);
        }
        
        int getNext(){
            Node temp=st.pop();
            if(reverse)
                pushAll(temp.left);
            else
                pushAll(temp.right);
                
            return temp.data;
        }
        
        void pushAll(Node root){
            Node temp=root;
            while(temp!=null){
                st.push(temp);
                if(reverse)
                    temp=temp.right;
                else
                    temp=temp.left;
            }
        }
        
        void print(){
            System.out.println(st);
        }
    }
    
    boolean findTarget(Node root, int target) {
        // Write your code here
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);
        int lval=l.getNext();
        int rval=r.getNext();
        while(lval<rval){
            if(lval+rval==target)
                return true;
            if(lval+rval<target)
                lval=l.getNext();
            else
                rval=r.getNext();
        }
        
        return false;
    }
}
