//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            System.out.println(ob.countAndSay(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public String countAndSay(int n) {
        // code here
        if(n==1)
            return "1";
        
        String s=countAndSay(n-1);
        
        int index=0;
        int nn=s.length();
        
        StringBuilder temp=new StringBuilder();
        
        while(index<nn){
            int count = 0;
            char c=s.charAt(index);
            
            while(index<nn && c==s.charAt(index)){
                count++;
                index++;
            }
            
            temp.append(Integer.toString(count)).append(c);
        }
        
        return temp.toString();
    }
}
