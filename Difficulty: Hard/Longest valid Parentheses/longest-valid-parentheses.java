//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        st.push(-1);
        int max=0;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='('){
                st.push(i);
            }
            else{
                int val=st.pop();
                if(!st.isEmpty())
                    max=Math.max(max,i-st.peek());
                else
                    st.push(i);
            }
        }
        
        return max;
    }
}