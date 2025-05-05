//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String str = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findSubString(String s) {
        // code here
        int unique=0;
        int n=s.length();
        int[] freq=new int[26];
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(freq[c-'a']==0)
                unique++;
            freq[c-'a']++;
        }
        
        int min=Integer.MAX_VALUE;

        int left = 0 , right = 0;
        int[] curr=new int[26];
        int current = 0;
        
        while(right<n){
            char c=s.charAt(right);
            if(curr[c-'a']==0)
                current++;
            
            curr[c-'a']++;
            
            while(left<=right && current==unique){
                c=s.charAt(left);
                curr[c-'a']--;
                if(curr[c-'a']==0)
                    current--;
                min=Math.min(min,right-left+1);
                left++;
            }
            
            right++;
        }
        
        return min;
    }
}