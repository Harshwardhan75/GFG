//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node head){
        Node prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        
        Node one=reverse(num1);
        Node two=reverse(num2);
        
        int carry=0;
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(one!=null || two!=null){
            int sum=0;
            sum+=carry;
            if(one!=null){
                sum+=one.data;
                one=one.next;
            }
            
            if(two!=null){
                sum+=two.data;
                two=two.next;
            }
            
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }
        
        Node newHead = reverse(dummy.next);
        if(carry==1){
            Node newNode = new Node(carry);
            newNode.next=newHead;
            newHead=newNode;
        }
        
        while(newHead != null && newHead.data==0)
            newHead=newHead.next;
        return newHead;
    }
}


//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends