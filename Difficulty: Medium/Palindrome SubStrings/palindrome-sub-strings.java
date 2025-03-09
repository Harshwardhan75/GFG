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

            System.out.println(obj.countPS(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public int countPS(String s) {
        // code here
        int count =0;
        char[] c=s.toCharArray();
        int n=s.length();
        
        for(int i=0;i<n;i++)
            count+=length(c,i-1,i+1);
        
        
        for(int i=1;i<n;i++)
            count+=length(c,i-1,i);
            
        return count;
    }
    
    int length(char[] c,int l,int r){
        int length = 0;
        while(l>=0 && r<c.length){
            if(c[l]==c[r]){
                length++;
                r++;
                l--;
            }
            else
                break;
        }
        
        return length;
    }
}