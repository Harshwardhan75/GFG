//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().trim().split(" ");
            Solution obj = new Solution();
            int res = obj.longestStringChain(words);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words,(a,b)->{
            int v=a.length()-b.length();
            if(v==0)
                v=a.compareTo(b);
            return v;
        });
        
        Map<String,Integer> map=new HashMap<>();
        for(String s: words){
            
            int n=s.length();
            for(int i=0;i<n;i++){
                String str = s.substring(0,i)+s.substring(i+1);
                if(map.containsKey(str)){
                    int prev=map.getOrDefault(str,0);
                    int b=map.getOrDefault(s,0);
                    map.put(s,Math.max(prev+1,b));
                }
            }
            
            if(!map.containsKey(s))
                map.put(s,1);
        }
        
        int max = 0;
        for(String key: map.keySet())
            max=Math.max(max,map.get(key));
        return max;
    }
}