//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.nthTribonacci(n);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int nthTribonacci(int n) {
        // code here
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }
    
    static int solve(int[] dp,int index){
        if(index==0)
            return 0;
        if(index==1)
            return 1;
        if(index==2)
            return 1;
            
        if(dp[index]!=-1)
            return dp[index];
        
        return dp[index]=solve(dp,index-1)+solve(dp,index-2)+solve(dp,index-3);
    }
}
