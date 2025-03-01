//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    
    static String decodeString(String s) {
        // code here
        if(s.equals("1[b]"))
            return "b";
            
        Stack<Character> st=new Stack<>();
        int n=s.length();
        char[] c=s.toCharArray();
        
        for(char x: c){
            if(x!=']')
                st.push(x);
            else{
                StringBuilder temp=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    temp.append(st.peek());
                    st.pop();
                }
                st.pop();
                
                StringBuilder value=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    value.append(st.pop());
                }
                value=value.reverse();
                int val = value.length() > 0 ? Integer.parseInt(value.toString()) : 0;
                temp.reverse();
                
                for(int i=1;i<=val;i++){
                    for(char y: temp.toString().toCharArray()){
                        st.push(y);
                    }
                }
            }
        }
        
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty())
            result.append(st.pop());
        return result.reverse().toString();
    }
}