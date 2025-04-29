//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;
        
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero = zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        two.next=null;
        one.next=twoHead.next;
        zero.next=oneHead.next;
        
        return zeroHead.next;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends