//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            String str = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.findMaximumNum(str, k));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to find the largest number after k swaps.
    Long max = 0l;
    public String findMaximumNum(String s, int k) {
        // code here.
        max=Long.parseLong(s);
        generate(s.toCharArray(),k);
        return Long.toString(max);
    }
    
    void generate(char[] c,int k){
        if(k==0)
            return;
            
        int n=c.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(c[j]>c[i]){
                    swap(c,i,j);
                    
                    long val = Long.parseLong(new String(c));
                    max=Math.max(max,val);
                    
                    generate(c,k-1);
                    
                    swap(c,i,j);
                }
            }
        }
    }
    
    void swap(char[] c,int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
    }
}