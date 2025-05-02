//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Node {
    Node next;
    int val;

    public Node(int data) {
        val = data;
        next = null;
    }
}

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t;
        t = Integer.parseInt(in.readLine());
        while (t-- > 0) {

            Node head, tail;
            String s[] = in.readLine().trim().split(" ");
            int num = Integer.parseInt(s[0]);
            head = new Node(num);
            tail = head;
            for (int i = 1; i < s.length; i++) {
                num = Integer.parseInt(s[i]);
                tail.next = new Node(num);
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node temp = ob.primeList(head);
            while (temp != null) {
                out.print(temp.val + " ");
                temp = temp.next;
            }
            out.println();
            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution {
    TreeSet<Integer> prime=new TreeSet<>();
    void seive(){
        int[] primearr=new int[20000];
        Arrays.fill(primearr,1);
        
        for(int i=2;i<primearr.length;i++){
            if(primearr[i]==1){
                prime.add(i);
                for(int j=i*i;j<primearr.length;j+=i){
                    primearr[j]=0;
                }
            }
        }
    }
    
    Node primeList(Node head) {
        // code here
        seive();  
        Node temp=head;
        
        while(temp!=null){
            Integer floor=prime.floor(temp.val);
            Integer ceil=prime.ceiling(temp.val);
            
            int abs1=floor!=null?Math.abs(floor-temp.val):Integer.MAX_VALUE;
            int abs2=ceil!=null?Math.abs(ceil-temp.val):Integer.MAX_VALUE;
            
            if(abs2<abs1)
                temp.val=ceil;
            else
               temp.val=floor; 
               
            temp=temp.next;
        }
        
        return head;
    }
}