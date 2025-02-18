//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int l=0,r=0;
        int[] freq=new int[26];
        for(int i=0;i<26;i++)   freq[i]=-1;
        
        int max=0;
        while(r<s.length()){
            if(freq[s.charAt(r)-'a']!=-1){
                if(l<=freq[s.charAt(r)-'a'])
                    l=freq[s.charAt(r)-'a']+1;
            }
            
            freq[s.charAt(r)-'a']=r;
            max=Math.max(max,r-l+1);
            r++;
        }
        
        return max;
    }
}