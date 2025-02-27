//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            String s=arr[i];
            if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")){
                int t2=st.pop();
                int t1=st.pop();
                int ans=0;
                
                switch(s){
                    case "+":
                        ans = t1+t2;
                        break;
                    case "-":
                        ans = t1-t2;
                        break;
                    case "*":
                        ans = t1*t2;
                        break;
                    case "/":
                        ans= t1/t2;
                }
                
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.pop();
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        while (t-- > 0) {
            line = reader.readLine();
            String[] arr = line.split(" ");
            Solution solution = new Solution();
            System.out.println(solution.evaluate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends