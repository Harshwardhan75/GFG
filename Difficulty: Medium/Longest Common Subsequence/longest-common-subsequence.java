//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s1 = sc.next(); // Take both the strings as input
            String s2 = sc.next();

            Solution obj = new Solution();

            // Call the lcs function with the lengths of the strings as
            // parameters
            System.out.println(obj.lcs(s1, s2));
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    static int lcs(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int[][] cost=new int[n+1][m+1];
        
        char[] sc1=s1.toCharArray();
        char[] sc2=s2.toCharArray();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int nexti=i+1;
                int nextj=j+1;
                if(sc1[i]==sc2[j]){
                    cost[nexti][nextj]=cost[nexti-1][nextj-1]+1;
                }
                else if(cost[nexti-1][nextj]>=cost[nexti][nextj-1])
                    cost[nexti][nextj]=cost[nexti-1][nextj];
                else
                    cost[nexti][nextj]=cost[nexti][nextj-1];
            }
        }
        
        return cost[n][m];
    }
}