//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxXor(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    class Node{
        Node[] links=new Node[2];
        
        void put(int index,Node node){
            links[index]=node;
        }
        
        Node get(int index){
            return links[index];
        }
        
        boolean contains(int index){
            return links[index]!=null;
        }
    }
    
    
    
    public int maxXor(int[] arr) {
        // code here
        Node root=new Node();
        for(int val: arr){
            Node temp=root;
            for(int i=21;i>=0;i--){
                int bit = (val>>i)&1;
                if(!temp.contains(bit))
                    temp.put(bit,new Node());
                temp=temp.get(bit);
            }
        }
        
        int max = 0;
        
        for(int val: arr){
            Node temp=root;
            int result = 0;
            for(int i=21;i>=0;i--){
                int bit = (val>>i)&1;
                int oppositebit=1-bit;
                
                if(temp.contains(oppositebit)){
                    result = result | 1<<i;
                    temp=temp.get(oppositebit);
                }
                else{
                    temp=temp.get(bit);
                }
            }
            
            max=Math.max(max,result);
        }
        
        return max;
    }
}