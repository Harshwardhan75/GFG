//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nCr(int n, int r) {
        // code here
        if(r>n)
            return 0;
            
        int rem = n-r;
        
        if(rem>r){
            int temp = rem;
            rem = r;
            r = temp;
        }
        
        long result = 1;
        
        for(int i=1;i<=rem;i++){
            int num = n-rem+i;
            int den = i;
            result = (result*num)/den;
        }
        
        // System.out.println(num+" "+div);
        
        return (int)(result);
    }
}