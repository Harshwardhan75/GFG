//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static String longestPalindrome(String s) {
        // code here
        char[] c=s.toCharArray();
        int n=c.length;
        int start=0;
        int maxlength=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(c,i,j)){
                    if(j-i+1>maxlength){
                        maxlength=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxlength);        
    }
    
    static boolean isPalindrome(char[] c,int s,int e){
        
        while(s<e){
            if(c[s]!=c[e])  return false;
            s++;
            e--;
        }
        return true;
    }
}