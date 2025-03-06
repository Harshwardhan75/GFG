//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.longestPalinSubseq(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestPalinSubseq(String s) {
        // code here
        int n=s.length();
        char[] c=s.toCharArray();
        char[] r=new StringBuilder(s).reverse().toString().toCharArray();
        int[][] lcs=new int[n+1][n+1];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int indexi=i+1;
                int indexj=j+1;
                
                if(c[i]==r[j]){
                    lcs[indexi][indexj]=lcs[indexi-1][indexj-1]+1;
                }
                else{
                    lcs[indexi][indexj]=Math.max(lcs[indexi-1][indexj],
                        lcs[indexi][indexj-1]);
                }
            }
        }
        
        return lcs[n][n];
    }
}